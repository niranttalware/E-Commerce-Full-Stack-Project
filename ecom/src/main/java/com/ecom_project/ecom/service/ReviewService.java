package com.ecom_project.ecom.service;

import java.util.List;

import com.ecom_project.ecom.exception.ProductException;
import com.ecom_project.ecom.modal.Review;
import com.ecom_project.ecom.modal.User;
import com.ecom_project.ecom.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
