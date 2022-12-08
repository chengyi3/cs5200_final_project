package com.example.springboot.repository;
import com.example.springboot.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userRepository extends JpaRepository<user, Integer> {

    @Query(value = "call create_user(:username, :pass, :email, :address)", nativeQuery = true)
    public user create_User(@Param("username") String username, @Param("pass") String pass, @Param("email") String email, @Param("address") String address);

    @Query(value = "call update_user(:username, :pass, :email, :address)", nativeQuery = true)
    public void update_user(@Param("username") String username, @Param("pass") String pass, @Param("email") String email, @Param("address") String address);


    @Query(value = "call find_user(:user_id)", nativeQuery = true)
    public user find_user(@Param("user_id") Integer user_id);

    @Query(value = "call find_all_users()", nativeQuery = true)
    public List<user> find_all_users();

    @Query(value = "call delete_user(:user_id)", nativeQuery = true)
    public void delete_user(@Param("user_id") Integer user_id);

}

