package com.fts.fts_products.resources;

import org.springframework.web.bind.annotation.RestController;

import com.fts.fts_products.entities.Product;
import com.fts.fts_products.services.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/products")

public class ProductResource {

  @Autowired
  private ProductService service;

  @GetMapping
  public ResponseEntity<List<Product>> findAll() {
    List<Product> list = service.findAll();

    return ResponseEntity.ok(list);
  }

}
