package com.trust.utils;

import com.trust.config.TrustRntConfig;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 文件上传工具类
 */
public class FileUtil {
    public static String uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        try {
            File targetFile = new File(filePath);
            if (!targetFile.exists()) {
                targetFile.mkdirs();
            }
            FileOutputStream out = new FileOutputStream(filePath + fileName);
            out.write(file);
            out.flush();
            out.close();
            return filePath + fileName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean deleteFile(String fileName) {
        File file = new File(fileName);
        // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
        if (file.exists() && file.isFile()) {
            return file.delete();
        } else {
            return false;
        }
    }

    public static String renameToUUID(String fileName) {
        return UUID.randomUUID() + "." + fileName.substring(fileName.lastIndexOf(".") + 1);
    }

    /**
     * 文件类型验证
     *
     * @param fileName
     * @return
     */
    public static int fileType(String fileName) {
        if (fileName == null) {
            fileName = "文件名为空！";
            return 500;

        } else {
            // 获取文件后缀名并转化为写，用于后续比较
            String fileType = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()).toLowerCase();
            // 创建图片类型数组0
            String[] img = {"bmp", "jpg", "jpeg", "png", "tiff", "gif", "pcx", "tga", "exif", "fpx", "svg", "psd",
                    "cdr", "pcd", "dxf", "ufo", "eps", "ai", "raw", "wmf"};
            for (int i = 0; i < img.length; i++) {
                if (img[i].equals(fileType)) {
                    return 0;
                }
            }

            // 创建文档类型数组1
            String[] document = {"txt", "doc", "docx", "xls", "htm", "html", "jsp", "rtf", "wpd", "pdf", "ppt"};
            for (int i = 0; i < document.length; i++) {
                if (document[i].equals(fileType)) {
                    return 1;
                }
            }
            // 创建视频类型数组2
            String[] video = {"mp4", "avi", "mov", "wmv", "asf", "navi", "3gp", "mkv", "f4v", "rmvb", "webm"};
            for (int i = 0; i < video.length; i++) {
                if (video[i].equals(fileType)) {
                    return 2;
                }
            }
            // 创建音乐类型数组3
            String[] music = {"mp3", "wma", "wav", "mod", "ra", "cd", "md", "asf", "aac", "vqf", "ape", "mid", "ogg",
                    "m4a", "vqf"};
            for (int i = 0; i < music.length; i++) {
                if (music[i].equals(fileType)) {
                    return 3;
                }
            }

        }
        //4
        return 0;
    }

    /**
     * 根据网络地址爬取网络图片保存本地临时目录
     * @param imagesUrl
     * @param savePath
     * @throws Exception
     */
    public static String crawlingImages(String imagesUrl,String savePath){
        try {
            imagesUrl=imagesUrl.replaceAll("%", "%25");//先将地址本身带有的%转为%25
            imagesUrl=imagesUrl.replaceAll(" ", "%20");//再将空格转换为%20
            URL url = new URL(imagesUrl);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5 * 1000);//超时响应时间为5秒
            InputStream inStream = conn.getInputStream();
            byte[] data = readInputStream(inStream);
            String pattern = imagesUrl.substring(imagesUrl.lastIndexOf("."),imagesUrl.length());
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");// 设置日期格式
            String dateDir = df.format(new Date());// new Date()为获取当前系统时间
            String serviceName = UUID.randomUUID().toString();
            String  fileName = dateDir+serviceName+pattern;
            File imageFile = new File(savePath+fileName);
            FileOutputStream outStream = new FileOutputStream(imageFile);
            outStream.write(data);
            outStream.close();
            return savePath+fileName;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据文件里写入图片
     * @param inStream
     * @return
     * @throws Exception
     */
    public static byte[] readInputStream(InputStream inStream) throws Exception{
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while( (len=inStream.read(buffer)) != -1 ){
            outStream.write(buffer, 0, len);
        }
        inStream.close();
        return outStream.toByteArray();
    }

    public static void main(String[] args) {
        String url = "https://pic4.40017.cn/scenery/destination/2016/08/26/18/FBByRG_540x304_00.jpg";
    }

    /**
     * 文件大小转换
     * @param file
     * @return
     */
    public String fileSize(File file) {
        // 文件大小转换
        DecimalFormat df1 = new DecimalFormat("0.00");
        String fileSizeString = "";
        long fileSize = file.length();
        if (fileSize < 1024) {
            fileSizeString = df1.format((double) fileSize) + "B";
        } else if (fileSize < 1048576) {
            fileSizeString = df1.format((double) fileSize / 1024) + "KB";
        } else if (fileSize < 1073741824) {
            fileSizeString = df1.format((double) fileSize / 1048576) + "M";
        } else {
            fileSizeString = df1.format((double) fileSize / 1073741824) + "G";
        }
        return fileSizeString;
    }
}
