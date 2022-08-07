package com.cts.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bean.Product;
import com.cts.dao.ProductDao;

@Service
public class ProductService {
	
	//wire dependency

	public Product getProductDetails(int product_code) {
		//add your code here
		return null;
	}
	
	public double calculatePrice(int quantity,double product_price) {
		//add your code here
		return 0.0;
	}
	
	public boolean validateProductCode(int product_code){
		//add your code here
		return false;
	}
	
	public boolean validateQuantity(int quantity){
		//add your code here
		return false;
	}
}
