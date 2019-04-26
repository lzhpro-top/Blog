package com.lzh.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lzh.BaseTest;

public class CategoryTest extends BaseTest{
	
	@Autowired
	ICategoryService categoryService;
	
	@Test
	public void searchCategory() {
		categoryService.searchCategory("spring");
	}
}
