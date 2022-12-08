package com.example.springboot.service;

import com.example.springboot.model.publisher;
import com.example.springboot.repository.publisherRepository;
import com.example.springboot.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class publisherService {
    publisherRepository publisherRepository;
    public void create_publisher(publisher publisher) {
        publisherRepository.create_publisher(publisher.getPublisher_name(), publisher.getAddress(), publisher.getPhone());
    }
}
