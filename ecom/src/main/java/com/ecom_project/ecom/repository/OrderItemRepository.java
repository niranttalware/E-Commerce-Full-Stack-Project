package com.ecom_project.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom_project.ecom.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<com.ecom_project.ecom.modal.OrderItem, Long> {

}
