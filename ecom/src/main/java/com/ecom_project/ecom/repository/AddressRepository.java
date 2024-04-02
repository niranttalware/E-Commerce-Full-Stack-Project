package com.ecom_project.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom_project.ecom.modal.Address;

public interface AddressRepository extends JpaRepository<com.ecom_project.ecom.modal.Address, Long> {

}
