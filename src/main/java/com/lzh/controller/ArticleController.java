package com.lzh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lzh.pojo.Result;
import com.lzh.service.IArticleService;

import io.swagger.annotations.Api;

/**
 * 文章控制器类
 * @ClassName: ArticleController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 梁中华
 * @date 2019年4月26日 上午10:16:47
 * @version V1.0 
 * @Company 山西特信环宇信息技术有限公司
 */
@Api(tags="文章信息查询")
@RestController
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	IArticleService articleService;
	
	@PostMapping("/listArticleByCategoryId")
	public Result listArticleByCategoryId(String categoryId) {
		return articleService.listArticleByCategoryId(categoryId);
	}
	
	
	
	
	
	
}
