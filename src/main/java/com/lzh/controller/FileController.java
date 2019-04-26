package com.lzh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lzh.service.IFileService;

/**
 * 
 * @ClassName: FileController
 * @Description: 文件处理类
 * @author 梁中华
 * @date 2019年4月26日 上午10:30:52
 * @version V1.0 
 * @Company 山西特信环宇信息技术有限公司
 */
@RestController
@RequestMapping("/file")
public class FileController {
	/**
	 * 旨在处理文件，将文件存放到指定目录下按路径存储
	 */
	@Autowired
	IFileService fileService;
	
	@PostMapping("/upload")
	public String upload(MultipartFile file) {
		return fileService.upload(file);
	}
	@PostMapping("/delete")
	public boolean delete(String path) {
		return fileService.delete(path);
	}
}
