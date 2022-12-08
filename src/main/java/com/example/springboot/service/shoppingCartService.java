package com.example.springboot.service;

import com.example.springboot.model.book;
import com.example.springboot.repository.shoppingCartRepository;
import com.example.springboot.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class shoppingCartService {
    shoppingCartRepository shoppingCartRepository;
    public void create_order(int user_id, int cartID) {
        shoppingCartRepository.create_order(user_id,cartID);
    }
    public void add_book_to_shopping_cart(int book_id, int cart_id, int q) {
        shoppingCartRepository.add_book_to_shopping_cart(book_id,cart_id,q);
    }
    public void delete_book_from_shopping_cart(int book_id, int cart_id, int q) {
        shoppingCartRepository.delete_book_from_shopping_cart(book_id,cart_id,q);
    }
    public List<book>  get_all_books_in_a_shoppingCart(int cart_ID) {
        return shoppingCartRepository.get_all_books_in_a_shoppingCart(cart_ID);
    }

}
