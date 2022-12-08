package com.example.springboot.repository;

import com.example.springboot.model.review;
import com.example.springboot.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface reviewRepository extends JpaRepository<review, Integer> {
    @Query(value = "select create_review(:book_id, :user_id, :content)", nativeQuery = true)
    public void create_review(@Param("book_id") int book_id, @Param("user_id") int user_id, @Param("content") String content);

}