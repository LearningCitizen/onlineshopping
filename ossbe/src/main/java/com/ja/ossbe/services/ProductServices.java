package com.ja.ossbe.services;

import com.ja.ossbe.dao.ProductRepository;
import com.ja.ossbe.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices implements IProductServices {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProduct( Integer productId){
        return productRepository.findById(productId).get();
    }

    @Override
    public Product addProduct(Product product) {
        productRepository.save(product);
        return product;
    }

}
