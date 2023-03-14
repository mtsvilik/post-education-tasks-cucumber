package com.solvd.posteducationtaskscucumber.saucedemo.db.persistence.impl;

import com.solvd.posteducationtaskscucumber.saucedemo.db.persistence.MyBatisConfig;
import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.Product;
import com.solvd.posteducationtaskscucumber.saucedemo.db.persistence.ProductRepository;
import org.apache.ibatis.session.SqlSession;

import java.util.Optional;

public class ProductMapperImpl implements ProductRepository {

    @Override
    public void create(Product product) {
        try (SqlSession sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            ProductRepository productRepository = sqlSession.getMapper(ProductRepository.class);
            productRepository.create(product);
        }
    }

    @Override
    public Optional<Product> read(Long id) {
        try (SqlSession sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            ProductRepository productRepository = sqlSession.getMapper(ProductRepository.class);
            return productRepository.read(id);
        }
    }

    @Override
    public void delete(Long deleteId) {
        try (SqlSession sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            ProductRepository productRepository = sqlSession.getMapper(ProductRepository.class);
            productRepository.delete(deleteId);
        }
    }
}
