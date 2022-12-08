package com.example.springboot.controller;

import com.example.springboot.model.user;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class homeController {
    @RequestMapping(method = RequestMethod.GET)
    public String Hello() {
        return "hello, world";
    }
}
