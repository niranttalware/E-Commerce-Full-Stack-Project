package com.ecom_project.ecom.service;

import com.ecom_project.ecom.exception.ProductException;
import com.ecom_project.ecom.modal.Cart;
import com.ecom_project.ecom.modal.CartItem;
import com.ecom_project.ecom.modal.User;
import com.ecom_project.ecom.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
