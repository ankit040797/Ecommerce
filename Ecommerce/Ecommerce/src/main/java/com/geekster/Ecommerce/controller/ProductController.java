package com.geekster.Ecommerce.controller;

import com.geekster.Ecommerce.model.Product;
import com.geekster.Ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("product")
    public String addProduct(@RequestBody Product newProduct) {
        return productService.saveProduct(newProduct);
    }

    @GetMapping("product")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @PutMapping("product/{id}")
    public String updateProduct(@PathVariable Integer id) {
        return productService.updateProduct(id);
    }

    @DeleteMapping("product/{id}")
    public String removeProduct(@PathVariable Integer id) {
        return productService.removeProduct(id);
    }
}
