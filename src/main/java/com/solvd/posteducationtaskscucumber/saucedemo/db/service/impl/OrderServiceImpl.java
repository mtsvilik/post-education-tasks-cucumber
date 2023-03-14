package com.solvd.posteducationtaskscucumber.saucedemo.db.service.impl;

import com.solvd.posteducationtaskscucumber.saucedemo.db.service.OrderService;
import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.Order;
import com.solvd.posteducationtaskscucumber.saucedemo.db.persistence.OrderRepository;
import com.solvd.posteducationtaskscucumber.saucedemo.db.persistence.impl.OrderMapperImpl;

import java.util.Optional;

public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl() {
        this.orderRepository = new OrderMapperImpl();
    }

    @Override
    public Order create(Long userId, Order order) {
        order.setId(null);
        orderRepository.create(userId, order);
        return order;
    }

    @Override
    public Optional<Order> read(Long id) {
        return orderRepository.read(id);
    }

    @Override
    public void delete(Long deleteId) {
        orderRepository.delete(deleteId);
    }
}
