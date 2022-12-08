package com.example.springboot.controller;

import com.example.springboot.model.user;
import com.example.springboot.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin(origins = "*")
public class userController {

    @Autowired
    userService userService;

    @GetMapping("/users")
    @ResponseBody
    public List<user> findAllUsers() {
        return userService.find_all_users();
    }

    @GetMapping("/users/{userId}")
    public user findUserById(@PathVariable(name = "userId") int userId) {

        return userService.find_user(userId);
    }

    @PostMapping("/users/user")
    public user createUser(@RequestBody user user) {

        return userService.create_user(user.getUsername(), user.getPassword(),user.getEmail(),user.getAddress());

    }

    @PutMapping("/users/user")
    public void updateUser(@RequestBody user user) {
        userService.update_user(user.getUsername(), user.getPassword(),user.getEmail(),user.getAddress());

    }

    @DeleteMapping("/users/user/{userId}")
    public void deleteUser(@PathVariable(name = "userId") int userId) {
        userService.delete_user(userId);
    }

}
