package com.fts.fts_products.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fts.fts_products.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
