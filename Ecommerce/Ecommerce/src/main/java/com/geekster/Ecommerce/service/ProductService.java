package com.geekster.Ecommerce.service;

import com.geekster.Ecommerce.model.Product;
import com.geekster.Ecommerce.repo.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProduct product;
    public String saveProduct(Product newProduct) {
        product.save(newProduct);
        return "Added";
    }

    public List<Product> getProducts() {
        return product.findAll();
    }

    public String updateProduct(Integer id) {
        Product add=product.findById(id).get();
        add.setProductBrand("sony");
        product.save(add);
        return "updated";
    }


    public String removeProduct(Integer id) {
        product.deleteById(id);
        return "removed";
    }
}
