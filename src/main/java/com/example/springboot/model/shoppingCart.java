package com.example.springboot.model;

import javax.persistence.*;
import java.util.Date;
@Entity
public class shoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cart_id")
    int cart_id;
    @Column(name = "user_id")
    int user_id;
    public shoppingCart(){

    }

    public shoppingCart(int cart_id, int user_id) {
        this.cart_id = cart_id;
        this.user_id = user_id;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
