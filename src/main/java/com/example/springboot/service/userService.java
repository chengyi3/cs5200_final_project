package com.example.springboot.service;

import com.example.springboot.model.user;
import com.example.springboot.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    private userRepository userRepository;
    public user create_user(String username, String password, String email, String address){
        return userRepository.create_User(username, password, email, address);
    }
    public void update_user(String username, String password, String email, String address) {
        userRepository.update_user(username,password,email,address);
    }
    public void delete_user(Integer user_id) {
        userRepository.delete_user(user_id);
    }
    public user find_user(Integer user_id) {
        return userRepository.find_user(user_id);
    }
    public List<user> find_all_users() {
        return userRepository.find_all_users();
    }

}
