package com.example.demolearnproject.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    List<Product> findAllByDeletedIsFalse();

    Integer countById(Integer id);
}
