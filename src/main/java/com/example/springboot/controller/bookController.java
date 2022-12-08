package com.example.springboot.controller;

import com.example.springboot.model.book;
import com.example.springboot.service.bookService;
import com.example.springboot.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "*")
public class bookController {
    @Autowired
    bookService bookService;
    @PostMapping("/book")
    public book create_book(book book){
        return bookService.create_book(book);
    }
    @PutMapping("/book")
    public void update_book(@RequestBody book book){
        bookService.update_book(book);

    }
    @DeleteMapping("/book/{bookID}")
    public void delete_book(@PathVariable(name = "category") int book_id){
        bookService.delete_book(book_id);

    }
    @GetMapping("/{category}")
    public List<String> search_book_by_category(@PathVariable(name = "category") String category){
        return bookService.search_book_by_category(category);

    }
    @GetMapping("/{book_id}/reviews")
    public List<String> find_all_reviews_of_a_book(@PathVariable(name = "book_id") int book_id){
        return bookService.find_all_reviews_of_a_book(book_id);

    }
    @GetMapping("/")
    public List<book> get_all_books(){
        return bookService.get_all_books();
    }
    @GetMapping("/{book_id}")
    public book find_book_by_id(@PathVariable(name = "book_id") int book_id){
        return bookService.find_book_by_id(book_id);
    }
}
