package com.fts.fts_products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fts.fts_products.entities.Product;
import com.fts.fts_products.repositories.ProductRepository;

@Service
public class ProductService {

  @Autowired
  private ProductRepository repository;

  public List<Product> findAll() {
    List<Product> list = repository.findAll();

    return list;
  }

}
