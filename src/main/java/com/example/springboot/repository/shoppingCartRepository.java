package com.example.springboot.repository;

import com.example.springboot.model.book;
import com.example.springboot.model.shoppingCart;
import com.example.springboot.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface shoppingCartRepository extends JpaRepository<shoppingCart, Integer> {
    @Query(value = "select create_order(:user_id, :cartID)", nativeQuery = true)
    public void create_order(@Param("user_id") int user_id, @Param("cartID") int cartID);
    @Query(value = "select add_book_to_shopping_cart(:book_id, :cart_id, :q)", nativeQuery = true)
    public void add_book_to_shopping_cart(@Param("book_id") int book_id, @Param("cart_id") int cart_id, @Param("q") int q);
    @Query(value = "select delete_book_from_shopping_cart(:book_id, :cart_id, :q)", nativeQuery = true)
    public void delete_book_from_shopping_cart(@Param("book_id") int book_id,@Param("cart_id") int cart_id, @Param("q") int q);
    @Query(value = "select get_all_books_in_a_shoppingCart(:cart_ID)", nativeQuery = true)
    public List<book> get_all_books_in_a_shoppingCart(@Param("book_id") int cart_ID);
}
