package com.solvd.posteducationtaskscucumber.saucedemo.db.persistence.impl;

import com.solvd.posteducationtaskscucumber.saucedemo.db.persistence.MyBatisConfig;
import com.solvd.posteducationtaskscucumber.saucedemo.db.persistence.UserRepository;
import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.User;
import org.apache.ibatis.session.SqlSession;

import java.util.Optional;

public class UserMapperImpl implements UserRepository {

    @Override
    public void create(User user) {
        try (SqlSession sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            UserRepository userRepository = sqlSession.getMapper(UserRepository.class);
            userRepository.create(user);
        }
    }

    @Override
    public Optional<User> readAll(Long id) {
        try (SqlSession sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            UserRepository userRepository = sqlSession.getMapper(UserRepository.class);
            return userRepository.readAll(id);
        }
    }

    @Override
    public void delete(Long deleteId) {
        try (SqlSession sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true)) {
            UserRepository userRepository = sqlSession.getMapper(UserRepository.class);
            userRepository.delete(deleteId);
        }
    }
}
