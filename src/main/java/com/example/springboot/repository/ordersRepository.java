package com.example.springboot.repository;

import com.example.springboot.model.orders;
import com.example.springboot.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ordersRepository extends JpaRepository<orders, Integer> {
    @Query(value = "select find_all_orders_of_a_user(:user_id)", nativeQuery = true)
    public List<orders> find_all_orders_of_a_user(@Param("user_id") int user_id);
}
