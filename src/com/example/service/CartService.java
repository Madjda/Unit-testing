package com.example.service;

import com.example.interfaces.IProductDao;
import com.example.model.Product;

public class CartService {
	
	private IProductDao pDao;              
	private CartDao cDao;
	
	public boolean addToCart(Product p) {
	   boolean added = false;
	   if(pDao.getQte(p)>0) {
	   added = cDao.add(p); 
	   }
	   return added;
	   
	   }

	public IProductDao getpDao() {
		return pDao;
	}

	public void setpDao(IProductDao pDao) {
		this.pDao = pDao;
	}

	public CartDao getcDao() {
		return cDao;
	}

	public void setcDao(CartDao cDao) {
		this.cDao = cDao;
	}  
	
	
}
