package com.trust.controller.rnt.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.channels.FileChannel;
import java.util.*;

@Controller
@RequestMapping(value = "/uploader")
public class Upload {

	// 跳转至上传页面
	@RequestMapping(value = "/toUpload")
	public String toUploader() {
		System.out.println("test");
		return "/upload/uploader";
	}

	// 上传文件
	@RequestMapping(value = "/upload")
	public void uploadFile(HttpServletRequest request,
						   HttpServletResponse response) throws IOException {
		try {

			response.setCharacterEncoding("UTF-8");
			Map map = new HashMap();
			MultipartFile uploadFile = ((MultipartHttpServletRequest) request)
					.getFile("file");
			// 文件的MD5
			String fileMd5 = request.getParameter("fileMd5");
			String chunk = request.getParameter("chunk");
			File file = new File("" + fileMd5);
			System.out.printf("checkFile11==="+file.getPath());

			if (!file.exists()) {
				file.mkdirs();// 创建文件夹
			}
			// 保存文件
			File chunkFile = new File("" + fileMd5 + "/" + chunk);
			System.out.printf("checkFile11111==="+chunkFile.getPath());
			if (!chunkFile.exists()) {
				chunkFile.createNewFile();
			}
			uploadFile.transferTo(chunkFile);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 合并或验证分片文件是否需要上传
	@RequestMapping(value = "/checkOrMerge")
	@ResponseBody
	public Map checkOrMerge(HttpServletRequest request,
							HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		String savePath = "";

		String action = request.getParameter("action");
		Map<String, String> map = new HashMap();

		if ("mergeChunks".equals(action)) {
			// 合并文件
			// 需要合并的文件的目录标记
			// 文件MD5
			String fileMd5 = request.getParameter("fileMd5");
			// 文件名称
			String fileName = request.getParameter("fileName");
			// 文件扩展名
			String suffixName = request.getParameter("ext");
			System.out.println("fileMd5  :" + fileMd5);
			System.out.println("fileName  :" + fileName);
			// 读取目录里的所有文件
			File f = new File(savePath + fileMd5);
			File[] fileArray = f.listFiles(new FileFilter() {
				// 排除目录只要文件
				@Override
				public boolean accept(File pathname) {
                    return !pathname.isDirectory();
                }
			});
			System.out.println(" fileArray " + fileArray);
			// 转成集合，便于排序
			List<File> fileList = new ArrayList<File>(Arrays.asList(fileArray));
			// 需要合并的文件才进行排序,即分片的大小大于1
			if (fileList != null && fileList.size() > 1) {
				Collections.sort(fileList, new Comparator<File>() {
					@Override
					public int compare(File o1, File o2) {
						// TODO Auto-generated method stub
						if (Integer.parseInt(o1.getName()) < Integer
								.parseInt(o2.getName())) {
							return -1;
						}
						return 1;
					}
				});
			}
			// 合并的文件夹
			File mergeFile = new File(savePath);
			if (!mergeFile.exists()) {
				mergeFile.mkdirs();
			}
			// UUID.randomUUID().toString()-->随机名
			File outputFile = new File(savePath + "/" + fileName);
			// 创建文件
			outputFile.createNewFile();
			// 输出流
			FileChannel outChnnel = new FileOutputStream(outputFile)
					.getChannel();
			// 合并
			FileChannel inChannel;
			for (File file : fileList) {
				inChannel = new FileInputStream(file).getChannel();
				inChannel.transferTo(0, inChannel.size(), outChnnel);
				inChannel.close();
				// 删除分片
				file.delete();
			}
			outChnnel.close();
			// 清除文件夹
			File tempFile = new File(savePath + fileMd5);
			if (tempFile.isDirectory() && tempFile.exists()) {
				tempFile.delete();
			}
			System.out.println("合并成功");
			// 文件路径
			map.put("path", fileName);

		} else if ("checkChunk".equals(action)) {
			// 检查当前分块是否上传成功
			String fileMd5 = request.getParameter("fileMd5");
			String chunk = request.getParameter("chunk");
			String chunkSize = request.getParameter("chunkSize");

			File checkFile = new File(savePath + fileMd5 + "/" + chunk);
			System.out.printf("checkFile==="+checkFile.getPath());
			response.setContentType("text/html;charset=utf-8");
			// 检查文件是否存在，且大小是否一致
			if (checkFile.exists()
					&& checkFile.length() == Integer.parseInt(chunkSize)) {
				// 上传过
				map.put("ifExist", "1");
			} else {
				// 没有上传过
				map.put("ifExist", "0");
			}

		}
		return map;
	}

	// 校验文件是否上传过
	@ResponseBody
	@RequestMapping(value = "/checkFileExists")
	public Map checkFileExists(String fileMd5) {
		// 根据文件的MD5,去数据库中查询是否存在,存在则返回true,并返回文件的存储路径
		// 不存在返回false,为了测试方便,此处直接返回false
		Map map = new HashMap();
		map.put("flag", false);
		// map.put("path", lst.get(0).getFilePath());
		return map;
	}
}
