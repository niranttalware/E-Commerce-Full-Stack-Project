package com.ecom_project.ecom.service;

import java.util.List;

import com.ecom_project.ecom.exception.ProductException;
import com.ecom_project.ecom.modal.Rating;
import com.ecom_project.ecom.modal.User;
import com.ecom_project.ecom.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
