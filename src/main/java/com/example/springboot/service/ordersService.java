package com.example.springboot.service;

import com.example.springboot.model.orders;
import com.example.springboot.repository.ordersRepository;
import com.example.springboot.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ordersService {
    ordersRepository ordersRepository;
    public List<orders> find_all_orders_of_a_user(int user_id){
        return ordersRepository.find_all_orders_of_a_user(user_id);
    }
}
