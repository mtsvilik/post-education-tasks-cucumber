package com.solvd.posteducationtaskscucumber.saucedemo.db.service;

import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.User;

public interface UserService {

    User create(User user);

    User readAll(Long id);

    void delete(Long deleteId);

}
