package com.solvd.posteducationtaskscucumber.saucedemo.db.domain;

import java.util.List;
import java.util.Objects;

public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private Integer zipCode;
    private List<Order> orders;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", zipCode=" + zipCode +
                ", orders=" + orders +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) && firstName.equals(user.firstName) &&
                lastName.equals(user.lastName) && userName.equals(user.userName) &&
                password.equals(user.password) && zipCode.equals(user.zipCode) && orders.equals(user.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, userName, password, zipCode, orders);
    }
}
