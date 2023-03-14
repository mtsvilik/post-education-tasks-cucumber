package com.solvd.posteducationtaskscucumber.saucedemo.db.persistence;

import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.Order;
import com.solvd.posteducationtaskscucumber.saucedemo.db.domain.Product;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

public interface OrderRepository {

    void create(@Param("userId") Long userId, @Param("order") Order order);

    void createProductConnection(Order order, Product product);

    Optional <Order> read(Long id);

    void delete(Long deleteId);

}
