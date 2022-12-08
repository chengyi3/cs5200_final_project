package com.example.springboot.model;

import javax.persistence.*;
import java.util.Date;
@Entity
public class orders {
    @Id
    @Column(name = "user_id")
    int user_id;
    @Column(name = "total_price")
    int total_price;
    @Id
    @Column(name = "cartID")
    int cartID;
    public orders(){

    }
    public orders(int user_id, int total_price, int cartID) {
        this.user_id = user_id;
        this.total_price = total_price;
        this.cartID = cartID;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }
}
