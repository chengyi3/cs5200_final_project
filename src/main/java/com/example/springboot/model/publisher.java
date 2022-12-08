package com.example.springboot.model;

import javax.persistence.*;

@Entity
public class publisher {
    @Id
    @Column(name = "publisher_name")
    String publisher_name;
    @Column(name = "address")
    String address;
    @Column(name = "phone")
    int phone;
    public publisher(){

    }

    public publisher(String publisher_name, String address, int phone) {
        this.publisher_name = publisher_name;
        this.address = address;
        this.phone = phone;
    }

    public String getPublisher_name() {
        return publisher_name;
    }

    public void setPublisher_name(String publisher_name) {
        this.publisher_name = publisher_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
