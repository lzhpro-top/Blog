package com.lzh.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.lzh.pojo.Category;

public interface CategoryRepository extends MongoRepository<Category, String>{
	@Query(value="{'_id':?0}",fields= "{'extras': 1,'certificateCopyCreationTime':1,'certificateCopyCreator':1,'certificateCopyCause':1,'certificateCopyExpiringTime':1}")
	public Category selectCopyByCertificateNumber(String id);
	
	@Query(value="{'categoryName':{'$regex':?0}}")
	public List<Category> likeByName(String text);
	
	/*@Query(sort="{'articleNum':-1}")
	public List<Category> selectHotCategory();*/
}
