package com.lzh.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzh.dao.CategoryRepository;
import com.lzh.dao.CommonRepository;
import com.lzh.pojo.Category;
import com.lzh.pojo.Result;
import com.lzh.service.ICategoryService;
@Service
public class CategoryServiceImpl implements ICategoryService{
	
	@Autowired
	Logger logger;
	
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	CommonRepository commonRepository;
	
	@Override
	public Result searchCategory(String text) {
		List<Category> list;
		if(text == null) {
			list = commonRepository.selectDefaultCategory();
		}else {
			list = categoryRepository.likeByName(text);
		}
		logger.info("searchCategory:"+list);
		return Result.ok(list);
	}
}
