package com.ja.ossbe.RestControllers;

import com.ja.ossbe.entities.Order;
import com.ja.ossbe.entities.Product;
import com.ja.ossbe.services.IProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private IProductServices productServices;

    @GetMapping("/")
    public List<Product> getProducts(){
        return productServices.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Integer id){
        return productServices.getProduct(id);
    }

    @PostMapping("/")
    public Product createProduct(@RequestBody Product product){
        product.setId(null);
        return productServices.addProduct(product);
    }

}
