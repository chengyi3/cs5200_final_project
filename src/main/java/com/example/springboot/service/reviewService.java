package com.example.springboot.service;

import com.example.springboot.model.user;
import com.example.springboot.repository.reviewRepository;
import com.example.springboot.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class reviewService {
    reviewRepository reviewRepository;

    public void create_review(int book_id,int user_id,String content){
        reviewRepository.create_review(book_id, user_id, content);
    }
}


