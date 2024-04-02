package com.ecom_project.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecom_project.ecom.modal.Cart;

public interface CartRepository extends JpaRepository<com.ecom_project.ecom.modal.Cart,Long>{

	@Query("SELECT c From Cart c where c.user.id=:userId")
	public com.ecom_project.ecom.modal.Cart findByUserId(@Param("userId")Long userId);
}
