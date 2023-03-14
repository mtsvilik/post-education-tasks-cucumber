package com.solvd.posteducationtaskscucumber.saucedemo.db.persistence;

import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.User;

import java.util.Optional;

public interface UserRepository {

    void create(User user);

    Optional<User> readAll(Long id);

    void delete(Long deleteId);

}
