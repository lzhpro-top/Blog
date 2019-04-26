package com.lzh.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lzh.dao.CategoryRepository;
import com.lzh.pojo.Category;
@Component
public class CommandRunner implements CommandLineRunner{

	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("spring boot init");
		
		Category c = Category.builder()
							.id("1")
							.articleNum(0)
							.categoryName("spring boot")
							.build();
		categoryRepository.save(c);
		Category c1 = Category.builder()
				.id("2")
				.articleNum(0)
				.categoryName("spring cloud")
				.build();
		categoryRepository.save(c1);
		
		
		
		
	}

}
