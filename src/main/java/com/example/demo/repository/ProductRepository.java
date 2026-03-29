package com.example.demo.repository;

import com.example.demo.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {


    List<Product> findByNameContainingIgnoreCase(String name);


    List<Product> findByPriceGreaterThan(BigDecimal price);


    List<Product> findByQuantityLessThan(Integer quantity);


    boolean existsByName(String name);


    void deleteByName(String name);


    Page<Product> findAll(Pageable pageable);


    @Query("SELECT p FROM Product p WHERE p.quantity = 0")
    List<Product> findOutOfStock();


    @Query("SELECT p FROM Product p WHERE p.price > :price")
    List<Product> findExpensiveProducts(@Param("price") BigDecimal price);
}