package com.example.springboot.controller;

import com.example.springboot.model.user;
import com.example.springboot.service.reviewService;
import com.example.springboot.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class reviewController {
    @Autowired
    reviewService reviewService;
    @PostMapping("/books/{book_id}/reviews/{user_id}")
    public void create_review(@PathVariable(name = "book_id") int book_id, @PathVariable(name = "user_id") int user_id, @RequestBody String content) {
        reviewService.create_review(book_id,user_id,content);
    }
}
