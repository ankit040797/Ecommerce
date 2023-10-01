package com.geekster.Ecommerce.controller;

import com.geekster.Ecommerce.model.OrderL;
import com.geekster.Ecommerce.service.OrderService;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public String addOrder(@RequestBody OrderL newOrder) {
        return orderService.saveOrder(newOrder);
    }

    @GetMapping("order")
    public List<OrderL> getOrders() {
        return orderService.getOrders();
    }


    @PutMapping("order/id/{id}")
    public String updateOrderById(@PathVariable Integer id, @RequestParam Integer ProQuality){
        return orderService.updateOrderById(id,ProQuality);
    }

    @DeleteMapping("order/{id}")
    public String removeOrder(@PathVariable Integer id) {
        return orderService.removeOrder(id);
    }
}
