package com.sidhu.springboot.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sidhu.springboot.shoppingbackend.dao.CategoryDAO;
import com.sidhu.springboot.shoppingbackend.dto.Category;


@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	

	
	private static List<Category> categories = new ArrayList<>();
	
	
	static{
		
		Category category =new Category();
		
		//Adding First Category
		
		category.setId(1);
		category.setName("Televesion");
		category.setDescription("This is some description for Televesion");
		category.setImageURL("CAT_1.png");
		// Active is by default true
		
		categories.add(category);
		
		
		//Adding Second Category
		        category =new Category();
				category.setId(2);
				category.setName("Mobile");
				category.setDescription("This is some description for Mobile");
				category.setImageURL("CAT_2.png");
				// Active is by default true
				
				categories.add(category);
				
				
				//Adding Third Category
				category =new Category();
				category.setId(3);
				category.setName("Laptop");
				category.setDescription("This is some description for Laptop");
				category.setImageURL("CAT_2.png");
				// Active is by default true
				
				categories.add(category);
		
		
		
		
		
	}
	

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	
	
	@Override
	public Category get(int id) {

      for(Category category: categories){
    	  
    	  if(category.getId()==id){
    		  
    		  
    		  return category;
    	  }
      }
		
		
		return null;
	}

}
