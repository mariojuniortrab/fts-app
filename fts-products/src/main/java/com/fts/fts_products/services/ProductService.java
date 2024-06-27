package com.fts.fts_products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fts.fts_products.entities.Company;
import com.fts.fts_products.entities.Product;
import com.fts.fts_products.feignclients.CompanyFeignClient;
import com.fts.fts_products.repositories.ProductRepository;

@Service
public class ProductService {

  @Autowired
  private ProductRepository repository;

  @Autowired
  private CompanyFeignClient companyFeignClient;

  public List<Product> findAll() {
    List<Product> list = repository.findAll();

    return list;
  }

  public Product geProductById(Long id) {
    Company company = companyFeignClient.GetById(1L).getBody();

    if (company != null) {
      System.out.println(company.getName());
    }
    return repository.findById(id).get();
  }

}
