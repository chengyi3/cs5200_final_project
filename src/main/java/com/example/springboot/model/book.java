package com.example.springboot.model;

import javax.persistence.*;
import java.util.Date;
@Entity
public class book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    int book_id;
    @Column(name = "author")
    String author;
    @Column(name = "category")
    String category;
    @Column(name = "publish_date")
    Date publish_date;
    @Column(name = "description")
    String Description;
    @Column(name = "price")
    int price;
    @Column(name = "book_name")
    String book_name;
    @Column(name = "publisherName")
    String publisherName;
    public book(){

    }


    public book(int book_id , String author, String category, Date publish_date, String Description, int price,String publisherName,String book_name) {
        super();
        this.book_id=book_id;
        this.author = author;
        this.category = category;
        this.publish_date = publish_date;
        this.Description = Description;
        this.price = price;
        this.book_name = book_name;
    }


    public int getId() {
        return book_id;
    }


    public void setId(int id) {
        this.book_id = id;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    public String getDescription() {
        return Description;
    }


    public void setDescription(String description) {
        this.Description = description;
    }

    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBook_name() {
        return book_name;
    }


    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
    public String getPublisherName() {
        return publisherName;
    }


    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
    public Date getPublish_Date() {
        return publish_date;
    }


    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }



    @Override
    public String toString() {
        return "Product [id=" + book_id + ", price=" + price + ", book_name=" + book_name + ", category="
                + category + ", description=" + Description + "]";
    }

}
