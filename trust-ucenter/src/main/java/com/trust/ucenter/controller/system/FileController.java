package com.trust.ucenter.controller.system;

import com.trust.oss.service.FileService;
import com.trust.oss.util.OssTools;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@Controller
@RequestMapping("/user/file")
public class FileController {
    @Value("${oss.uploadpath}")
    private String uploadpath;

    @Autowired
    private FileService fileService;

    /**
     * 阿里云OSS文件上传
     * @param file
     * @return
     */
    @RequestMapping("/upload")
    @ResponseBody
    public Map<String, Object> uploadFile(MultipartFile file){
        Map result = new HashMap();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");// 设置日期格式
        String dateDir = df.format(new Date());// new Date()为获取当前系统时间
        String serviceName = UUID.randomUUID().toString();
        if(file!=null){
            try {
                    String contentresult = fileService.uploadImage( OssTools.Bucket.RNT, uploadpath,file.getOriginalFilename(), file.getInputStream());
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
     * 阿里云OSS文件删除
     * @param pathUrl
     * @return
     */
    @RequestMapping("/delete")
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
