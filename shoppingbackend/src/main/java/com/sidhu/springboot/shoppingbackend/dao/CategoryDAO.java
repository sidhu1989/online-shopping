package com.sidhu.springboot.shoppingbackend.dao;

import java.util.List;

import com.sidhu.springboot.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
