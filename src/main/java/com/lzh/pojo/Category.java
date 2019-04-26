package com.lzh.pojo;

import com.lzh.pojo.Article.ArticleBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @ClassName: Category
 * @Description: 分类
 * @author 梁中华
 * @date 2019年4月26日 下午1:41:20
 * @version V1.0 
 * @Company 山西特信环宇信息技术有限公司
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {
	private String id;
	private String categoryName;
	//文章数
	private int articleNum;
}
