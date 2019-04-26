package com.lzh.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.lzh.pojo.Category;

@Repository
public class CommonRepository {
	@Autowired
	MongoTemplate mongoTemplate;
	
	
	public List<Category> selectDefaultCategory() {
		Query query = new Query().with(Sort.by("articleNum")).limit(5).skip(0);
		List<Category> find = mongoTemplate.find(query, Category.class);
		return find;
	}
}
