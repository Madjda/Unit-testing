package com.example.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.example.interfaces.IProductDao;
import com.example.model.Product;
import com.example.service.CartDao;
import com.example.service.CartService;

public class TestServices {
	
	IProductDao pDao;
	CartDao cDao;
	
	@Before
	public void setUp() {	
		 
		 pDao=Mockito.mock(IProductDao.class);
		 cDao=Mockito.mock(CartDao.class);

	}

	
    @Test
	public void testAddToCart() {
		Product p1 = new Product(1213322,"Smasung Galaxy");
		when(pDao.getQte(p1)).thenReturn(5);
		when(cDao.add(p1)).thenReturn(true);
		CartService cartService = new CartService();
		cartService.setpDao(pDao);
		cartService.setcDao(cDao);
		boolean add = cartService.addToCart(p1);
		assertTrue(add);
		
	                             }
	
	@After
	public void tearDown() {
	}
	

}
