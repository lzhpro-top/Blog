package com.lzh.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @ClassName: Article
 * @Description: 文章
 * @author 梁中华
 * @date 2019年4月26日 下午1:38:46
 * @version V1.0 
 * @Company 山西特信环宇信息技术有限公司
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Article {
	private String id;
	private String categoryId;
	private String title;
	private String detail;
	private String imgUrl;
	private String content;
	
}
