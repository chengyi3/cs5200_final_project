package com.example.springboot.repository;

import com.example.springboot.model.book;
import com.example.springboot.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@EnableJpaRepositories
public interface bookRepository extends JpaRepository<book, Integer> {
    @Query(value = "select create_book(:author, :category, :publish_date, :des, :price, :publisherName, :book_name)", nativeQuery = true)
    public book create_book(@Param("author") String author, @Param("category") String category, @Param("publish_date") Date publish_date, @Param("des") String des, @Param("price") int price, @Param("publisherName") String publisherName, @Param("book_name") String book_name);
    @Query(value = "select update_book(:book_id, :author, :category, :publish_date, :des, :price, :publisherName, :book_name)", nativeQuery = true)
    public void update_book(@Param("book_id") int book_id, @Param("author") String author, @Param("category") String category, @Param("publish_date") Date publish_date, @Param("des") String des, @Param("price") int price, @Param("publisherName") String publisherName, @Param("book_name") String book_name);

    @Query(value = "select delete_book(:book_id)", nativeQuery = true)
    public void delete_book(@Param("book_id") int book_id);
    @Query(value = "select search_book_by_category(:category)", nativeQuery = true)
    public List<String> search_book_by_category(@Param("category") String category);
    @Query(value = "select find_all_reviews_of_a_book(:book_id)", nativeQuery = true)
    public List<String> find_all_reviews_of_a_book(@Param("book_id") int book_id);
    @Query(value = "select get_all_books()", nativeQuery = true)
    public List<book> get_all_books();
    @Query(value = "select find_book_by_id(:book_id)", nativeQuery = true)
    public book find_book_by_id(@Param("book_id") int book_id);

}
