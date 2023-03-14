package com.solvd.posteducationtaskscucumber.saucedemo.db.persistence;

import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.Product;

import java.util.Optional;

public interface ProductRepository {

    void create(Product product);

    Optional<Product> read(Long id);

    void delete(Long deleteId);

}
