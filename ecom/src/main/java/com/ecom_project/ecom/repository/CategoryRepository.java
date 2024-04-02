package com.ecom_project.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecom_project.ecom.modal.Category;

public interface CategoryRepository extends JpaRepository<com.ecom_project.ecom.modal.Category, Long> {
	
	public com.ecom_project.ecom.modal.Category findByName(String name);

	@Query("Select c from Category c where c.name=:name AND c.parentCategory.name=:parentCategoryName")
	public com.ecom_project.ecom.modal.Category findByNameAndParant(@Param("name") String name, @Param("parentCategoryName")String parentCategoryName);
}
