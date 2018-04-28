package com.trust.controller.rnt.system;

import com.trust.config.TrustRntConfig;
import com.trust.oss.service.FileService;
import com.trust.oss.util.OssTools;
import com.trust.utils.FileUtil;
import com.trust.utils.ResultData;
import net.sf.json.JSONObject;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Author Yangcb
 * @Descrintion 文件上传Controller
 * @Date create 2018-01-03 19:41
 * @Version 1.0
 */
@Controller
@RequestMapping("/rntadmin/sys/file")
public class FileController extends BaseController {
    @Autowired
    private TrustRntConfig trustRntConfig;

    @Autowired
    private FileService fileService;


    /**
     * 删除临时上传文件
     *
     * @param filePath
     * @param request
     * @return
     */
    @PostMapping("/remove")
    @ResponseBody
    public ResultData remove(@RequestParam("filePath") String filePath, HttpServletRequest request) {
        if (!"".equals(filePath) && filePath != null) {
            boolean b = FileUtil.deleteFile(filePath);
            if (b) {
                return new ResultData("200", "success");
            }
            return new ResultData("401", "文件路径错误或者文件不存在");
        }
        return new ResultData("401", "文件路径不能为空");
    }

    /**
     * 文件上传
     *
     * @param
     * @param request
     * @return
     */
    @ResponseBody
    @PostMapping("/upload")
    public ResultData upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        String fileName = file.getOriginalFilename();
        fileName = FileUtil.renameToUUID(fileName);
        int fileType = FileUtil.fileType(fileName);
        if (fileType != 1) {
            try {
                String filePath = FileUtil.uploadFile(file.getBytes(), trustRntConfig.getUploadpath(), fileName);
                return new ResultData("200", "上传成功", filePath);
            } catch (Exception e) {
                return new ResultData("500", "上传失败");
            }

        }
        return new ResultData("401", "文件类型错误");
    }


    @RequestMapping("/toUpload")
    public String toIndex() {
       return "/upload/index";
    }
    // 文件上传
    @RequestMapping("/fileUpload")
    public Map fileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest req) {
        Map result = new HashMap();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");// 设置日期格式
        String dateDir = df.format(new Date());// new Date()为获取当前系统时间
        String serviceName = UUID.randomUUID().toString()
                + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        File tempFile = new File("/temp/" + dateDir + File.separator + serviceName);
        if (!tempFile.getParentFile().exists()) {
            tempFile.getParentFile().mkdirs();
        }
        if (!file.isEmpty()) {
            try {
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(tempFile));
                // "d:/"+file.getOriginalFilename() 指定目录
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                result.put("msg", "上传失败," + e.getMessage());
                result.put("state", false);
                return result;
            } catch (IOException e) {
                e.printStackTrace();
                result.put("msg", "上传失败," + e.getMessage());
                result.put("state", false);
                return result;
            }
            result.put("msg", "上传成功");
            return result;
        } else {
            result.put("msg", "上传失败，因为文件是空的");
            result.put("state", false);
            return result;
        }
    }

    /**
     * 文件下载
     * @param resp
     * @throws IOException
     */
    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public void testDownload(HttpServletResponse resp) throws IOException {
        File file = new File("D:/问题.txt");
        resp.setHeader("content-type", "application/octet-stream");
        resp.setContentType("application/octet-stream");
        resp.setHeader("Content-Disposition", "attachment;filename=" + file.getName());
        byte[] buff = new byte[1024];
        BufferedInputStream bis = null;
        OutputStream os = null;
        try {
            os = resp.getOutputStream();
            bis = new BufferedInputStream(new FileInputStream(file));
            int i = bis.read(buff);
            while (i != -1) {
                os.write(buff, 0, buff.length);
                os.flush();
                i = bis.read(buff);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 阿里云OSS文件上传
     * @param upfile
     * @return
     */
    @RequestMapping("/uedtiorupload")
    @ResponseBody//@RequestParam("upfile") Commons
    public Map<String, Object> uploadFileUeditor(MultipartFile upfile, HttpServletRequest request){
        Map result = new HashMap();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");// 设置日期格式
        String dateDir = df.format(new Date());// new Date()为获取当前系统时间
        String serviceName = UUID.randomUUID().toString();
        if(upfile!=null){
            try {
                String contentresult = fileService.uploadImage( OssTools.Bucket.RNT, trustRntConfig.getUploadpath(),upfile.getOriginalFilename(), upfile.getInputStream());
                JSONObject json = JSONObject.fromObject(contentresult);
                if (json.get("success").equals(true)) {
                    result.put("msg", "上传成功");
                    result.put("url", json.get("filePath").toString());
                    result.put("state", "SUCCESS");
                    //现在文件名称
                    result.put("title", json.get("filePath").toString().substring(json.get("filePath").toString().lastIndexOf("/")));
                    //文件原名称
                    result.put("original", upfile.getOriginalFilename());
                    //文件类型 .+后缀名
                    result.put("type", upfile.getOriginalFilename().substring(upfile.getOriginalFilename().lastIndexOf(".")));
                    //文件路径
                    result.put("url", json.get("filePath").toString());
                    //文件大小（字节数）
                    result.put("size", upfile.getSize()+"");
                } else {
                    result.put("msg", "上传阿里云失败");
                    result.put("state", false);
                }
            }catch (IOException e) {
                result.put("msg", "上传阿里云失败");
                result.put("state", false);
                e.printStackTrace();
            }
        }else{
            result.put("msg", "上传成功");
            result.put("state", "SUCCESS");
            //现在文件名称
            result.put("title", "ddd");
            //文件原名称
            result.put("original", "dd.png");
            //文件类型 .+后缀名
            result.put("type", "png");
            //文件路径
            result.put("url", "");
            //文件大小（字节数）
            result.put("size", 343);
        }

        return result;
    }
    /**
     * 阿里云OSS文件上传
     * @param file
     * @return
     */
    @RequestMapping("/uploadfile")
    @ResponseBody
    public Map<String, Object> uploadFile(MultipartFile file){
        Map result = new HashMap();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");// 设置日期格式
        String dateDir = df.format(new Date());// new Date()为获取当前系统时间
        String serviceName = UUID.randomUUID().toString();
        if(file!=null){
            try {
                    String contentresult = fileService.uploadImage( OssTools.Bucket.RNT, trustRntConfig.getUploadpath(),file.getOriginalFilename(), file.getInputStream());
                    JSONObject json = JSONObject.fromObject(contentresult);
                    if (json.get("success").equals(true)) {
                        result.put("msg", "上传成功");
                        result.put("url", json.get("filePath").toString());
                        result.put("state", true);
                    } else {
                        result.put("msg", "上传阿里云失败");
                        result.put("state", false);
                    }
               }catch (IOException e) {
                result.put("msg", "上传阿里云失败");
                result.put("state", false);
                    e.printStackTrace();
            }

        } else {
            result.put("msg", "上传失败，文件为空");
            result.put("state", false);
        }
        return result;
    }

    /**
     * 阿里云OSS文件上传
     * @param pathUrl
     * @return
     */
    @RequestMapping("/deletefile")
    @ResponseBody
    public Map<String, Object> removeFile(@RequestParam(value = "pathUrl",required = true) String pathUrl){
        Map result = new HashMap();
        if(!"".equals(pathUrl)&&pathUrl!=null){
            try {
                String contentresult = fileService.deleteFile(OssTools.Bucket.RNT,pathUrl.split("oss-cn-hangzhou.aliyuncs.com/")[1]);
                JSONObject json = JSONObject.fromObject(contentresult);
                if (json.get("success").equals(true)) {
                    result.put("msg", "删除成功");
                    result.put("state", true);
                } else {
                    result.put("msg", "删除失败");
                    result.put("state", false);
                }
            } catch (Exception e) {
                e.printStackTrace();
                result.put("msg", "删除失败");
                result.put("state", false);
            }
        } else {
            result.put("msg", "上传失败，文件为空");
            result.put("state", false);
        }
        return result;
    }

}
