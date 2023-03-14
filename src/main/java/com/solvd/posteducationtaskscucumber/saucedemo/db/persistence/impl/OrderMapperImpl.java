package com.solvd.posteducationtaskscucumber.saucedemo.db.persistence.impl;

import com.solvd.posteducationtaskscucumber.saucedemo.db.persistence.MyBatisConfig;
import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.Order;
import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.Product;
import com.solvd.posteducationtaskscucumber.saucedemo.db.persistence.OrderRepository;
import org.apache.ibatis.session.SqlSession;

import java.util.Optional;

public class OrderMapperImpl implements OrderRepository {

    @Override
    public void create(Long userId, Order order) {
        try (SqlSession sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            OrderRepository orderRepository = sqlSession.getMapper(OrderRepository.class);
            orderRepository.create(userId, order);
        }
    }

    @Override
    public void createProductConnection(Order order, Product product) {
        try (SqlSession sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            OrderRepository orderRepository = sqlSession.getMapper(OrderRepository.class);
            orderRepository.createProductConnection(order, product);
        }
    }

    @Override
    public Optional<Order> read(Long id) {
        try (SqlSession sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            OrderRepository orderRepository = sqlSession.getMapper(OrderRepository.class);
            return orderRepository.read(id);
        }
    }

    @Override
    public void delete(Long deleteId) {
        try (SqlSession sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            OrderRepository orderRepository = sqlSession.getMapper(OrderRepository.class);
            orderRepository.delete(deleteId);
        }
    }
}
