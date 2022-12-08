package com.example.springboot.controller;

import com.example.springboot.model.book;
import com.example.springboot.service.shoppingCartService;
import com.example.springboot.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

@CrossOrigin(origins = "*")
public class shoppingCartController {
    @Autowired
    shoppingCartService shoppingCartService;
    @PostMapping("/users/{userID}/carts/{cartID}")
    public void create_order(@PathVariable(name = "userID") int user_id, @PathVariable(name = "cartID") int cartID){
        shoppingCartService.create_order(user_id, cartID);

   }
    @PostMapping("/carts/{cartID}/{book_id}")
    public void add_book_to_shopping_cart(@PathVariable(name = "book_id") int book_id, @PathVariable(name = "cart_id") int cart_id, @RequestBody int q){
        shoppingCartService.add_book_to_shopping_cart(book_id, cart_id, q);

    }
    @DeleteMapping("/carts/{cartID}/{book_id}")
    public void delete_book_from_shopping_cart(@PathVariable(name = "book_id") int book_id, @PathVariable(name = "cartID") int cart_id, @RequestBody int q){
        shoppingCartService.delete_book_from_shopping_cart(book_id, cart_id, q);

    }
    @GetMapping("/carts/{cartID}")
    public List<book> get_all_books_in_a_shoppingCart(@PathVariable(name = "cartID") int cart_ID){
        return shoppingCartService.get_all_books_in_a_shoppingCart(cart_ID);

    }


}
