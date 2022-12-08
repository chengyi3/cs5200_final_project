package com.example.springboot.controller;

import com.example.springboot.model.orders;
import com.example.springboot.repository.ordersRepository;
import com.example.springboot.service.ordersService;
import com.example.springboot.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ordersController {
    @Autowired
    ordersService ordersService;
    @GetMapping("/users/{user_id}/orders")
    public List<orders> find_all_orders_of_a_user(@PathVariable(name = "user_id") int user_id){
        return ordersService.find_all_orders_of_a_user(user_id);
    }
}
