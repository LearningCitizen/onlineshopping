package com.ja.ossbe.services;

import com.ja.ossbe.entities.Product;

import java.util.List;

public interface IProductServices {
    public List<Product> getAllProducts();
    public Product getProduct( Integer productId);
    public Product addProduct(Product product);
}
