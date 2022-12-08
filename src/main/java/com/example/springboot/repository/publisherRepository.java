package com.example.springboot.repository;

import com.example.springboot.model.publisher;
import com.example.springboot.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface publisherRepository extends JpaRepository<publisher, String> {
    @Query(value = "select create_publisher(:publisher_name, :address, :phone)", nativeQuery = true)
    public void create_publisher(@Param("publisher_name") String publisher_name,@Param("address") String address,@Param("phone") int phone);
}
