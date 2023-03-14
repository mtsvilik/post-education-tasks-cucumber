package com.solvd.posteducationtaskscucumber.saucedemo.db.domain;

import java.util.List;
import java.util.Objects;

public class Order {

    private Long id;
    private List<Product> products;

    public Long getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return getId().equals(order.getId()) && getProducts().equals(order.getProducts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getProducts());
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + products +
                '}';
    }
}
