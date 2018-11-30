package com.ja.ossbe.services;

import com.ja.ossbe.dao.OrderRepository;
import com.ja.ossbe.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServices implements IOrderServices {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order saveOrder(Order order) {
        orderRepository.save(order);
        return order;
    }
}
