package com.geekster.Ecommerce.repo;

import com.geekster.Ecommerce.model.OrderL;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrder extends JpaRepository<OrderL, Integer> {
}
