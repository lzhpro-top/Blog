package com.lzh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lzh.pojo.Result;
import com.lzh.service.ICategoryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @ClassName: CategoryController
 * @Description: 文章分类控制器
 * @author 梁中华
 * @date 2019年4月26日 下午2:47:35
 * @version V1.0 
 * @Company 山西特信环宇信息技术有限公司
 */
@Api(tags="目录管理")
@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	ICategoryService categoryService;
	
	@ApiOperation(value="ad")
	@PostMapping("/searchCategory")
	public Result searchCategory(String text) {
		return categoryService.searchCategory(text);
	}
}
