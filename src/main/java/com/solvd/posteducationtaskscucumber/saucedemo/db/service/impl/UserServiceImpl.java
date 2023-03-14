package com.solvd.posteducationtaskscucumber.saucedemo.db.service.impl;

import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.User;
import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.exception.QueryException;
import com.solvd.posteducationtaskscucumber.saucedemo.db.persistence.UserRepository;
import com.solvd.posteducationtaskscucumber.saucedemo.db.persistence.impl.UserMapperImpl;
import com.solvd.posteducationtaskscucumber.saucedemo.db.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl() {
        this.userRepository = new UserMapperImpl();
    }

    @Override
    public User create(User user) {
        user.setId(null);
        userRepository.create(user);
        return user;
    }

    @Override
    public User readAll(Long id) {
        return userRepository.readAll(id)
                .orElseThrow(() -> new QueryException("No users found"));
    }

    @Override
    public void delete(Long deleteId) {
        userRepository.delete(deleteId);
    }
}
