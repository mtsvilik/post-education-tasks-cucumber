package com.solvd.posteducationtaskscucumber.saucedemo.db.service;

import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.Order;

import java.util.Optional;

public interface OrderService {

    Order create(Long userId, Order order);

    Optional<Order> read(Long id);

    void delete(Long deleteId);

}
