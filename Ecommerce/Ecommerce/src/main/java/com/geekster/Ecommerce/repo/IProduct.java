package com.geekster.Ecommerce.repo;

import com.geekster.Ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduct extends JpaRepository<Product,Integer> {
}
