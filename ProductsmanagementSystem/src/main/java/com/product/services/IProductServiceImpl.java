package com.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repo.IProductRepository;

@Service
public class IProductServiceImpl implements IProductService {

	@Autowired
	IProductRepository productRepository;
	@Override
	public Integer addProduct(Product product) {
		// TODO Auto-generated method stub
		Product productId = productRepository.save(product);
		return productId.getId();
	}
	@Override
	public List<Product> getAllproducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
