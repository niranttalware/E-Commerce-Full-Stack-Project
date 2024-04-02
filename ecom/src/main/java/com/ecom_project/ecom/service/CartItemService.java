package com.ecom_project.ecom.service;

import com.ecom_project.ecom.exception.CartItemException;
import com.ecom_project.ecom.exception.UserException;
import com.ecom_project.ecom.modal.Cart;
import com.ecom_project.ecom.modal.CartItem;
import com.ecom_project.ecom.modal.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
