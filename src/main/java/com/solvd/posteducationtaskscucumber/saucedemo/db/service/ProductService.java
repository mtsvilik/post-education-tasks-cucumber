package com.solvd.posteducationtaskscucumber.saucedemo.db.service;

import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.Product;

public interface ProductService {

    Product create(Product product);

    Product read(Long id);

    void delete(Long deleteId);

}
