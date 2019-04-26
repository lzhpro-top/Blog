package com.lzh.service.impl;

import java.awt.geom.GeneralPath;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.lzh.service.IFileService;
@Service
public class FileServiceImpl implements IFileService{
	
	//文件根路径
	@Value("${file.root}")
	String fileRoot;
	/**
	 * 上传文件
	 */
	@Override
	public String upload(MultipartFile file) {
		System.out.println(file.getOriginalFilename());
		String[] fileNames = file.getOriginalFilename().split("\\.");
		System.out.println(fileRoot);
		String filePath = generatePaht(file.hashCode(), fileNames[fileNames.length-1]);
		System.out.println(filePath);
		File newFile = new File(fileRoot+filePath);
		try {
			file.transferTo(newFile);
			return filePath;
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	//生成文件路径
	public String generatePaht(int hashCode,String extName) {
		int hash = Math.abs(hashCode);
		StringBuilder sb = new StringBuilder();
		sb.append("/file");
		sb.append("/0"+hash%10);
		sb.append("/0"+hash/10%10);
		sb.append("/0"+hash/10/10%10);
		File file = new File(fileRoot+sb.toString());
		if(!file.exists()) file.mkdirs();
		sb.append("/"+new UUID(0, 0).randomUUID().toString().replaceAll("-", ""));
		sb.append("."+extName);
		return sb.toString();
	}

	@Override
	public boolean delete(String path) {
		File file = new File(fileRoot+path);
		boolean flag = file.delete();
		return flag;
	}
}
