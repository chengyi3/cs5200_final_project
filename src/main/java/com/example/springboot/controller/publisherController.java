package com.example.springboot.controller;

import com.example.springboot.model.orders;
import com.example.springboot.model.publisher;
import com.example.springboot.service.ordersService;
import com.example.springboot.service.publisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class publisherController {


    @Autowired
    publisherService publisherService;
    @PostMapping("/publishers")
    public void create_publisher(@RequestBody publisher publisher){
        publisherService.create_publisher(publisher);
    }

}
