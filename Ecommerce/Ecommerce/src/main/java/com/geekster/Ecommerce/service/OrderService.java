package com.geekster.Ecommerce.service;

import com.geekster.Ecommerce.model.OrderL;
import com.geekster.Ecommerce.model.User;
import com.geekster.Ecommerce.repo.IOrder;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    IOrder order;
    public String saveOrder(OrderL newOrder) {
        order.save(newOrder);
        return "added";
    }


    public List<OrderL> getOrders() {
        return order.findAll();
    }

    public String removeOrder(Integer id) {
        order.deleteById(id);
        return "removed";
    }

    public String updateOrderById(Integer id, Integer ProQuality ) {
        OrderL prsentOrder=order.findById(Math.toIntExact(id)).orElse(null);
        if(prsentOrder!=null){
            prsentOrder.setProductQuantity(ProQuality);
            order.save(prsentOrder);
            return "Quatity updates";

        }else{
            return "Order Not Found";
        }

    }
}
