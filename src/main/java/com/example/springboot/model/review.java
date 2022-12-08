package com.example.springboot.model;

import javax.persistence.*;
import java.util.Date;
@Entity
public class review {
    @Column(name = "review_date")
    Date review_date;
    @Column(name = "content")
    String content;
    @Column(name = "user_id")
    int user_id;
    @Column(name = "book_id")
    int book_id;
    public review() {

    }

    public review(Date review_date, String content, int user_id, int book_id) {
        this.review_date = review_date;
        this.content = content;
        this.user_id = user_id;
        this.book_id = book_id;
    }

    public Date getReview_date() {
        return review_date;
    }

    public void setReview_date(Date review_date) {
        this.review_date = review_date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }
}
