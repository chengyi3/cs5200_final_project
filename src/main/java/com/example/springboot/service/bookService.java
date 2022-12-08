package com.example.springboot.service;

import com.example.springboot.model.book;
import com.example.springboot.repository.bookRepository;
import com.example.springboot.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class bookService {

    bookRepository bookRepository;
    public book create_book(book book){
        return bookRepository.create_book(book.getAuthor(), book.getCategory(), book.getPublish_Date(), book.getDescription(), book.getPrice(), book.getPublisherName(), book.getBook_name());

    }
    public void update_book(book book){
        bookRepository.update_book(book.getId(),book.getAuthor(), book.getCategory(), book.getPublish_Date(), book.getDescription(), book.getPrice(), book.getPublisherName(), book.getBook_name());

    }
    public void delete_book(int book_id){
        bookRepository.delete_book(book_id);

    }

    public List<String> search_book_by_category(String category){
        return bookRepository.search_book_by_category(category);

    }
    public List<String> find_all_reviews_of_a_book(int book_id){
        return bookRepository.find_all_reviews_of_a_book(book_id);

    }
    public List<book> get_all_books(){
        return bookRepository.get_all_books();
    }
    public book find_book_by_id( int book_id){
        return bookRepository.find_book_by_id(book_id);
    }
}
