package com.fts.fts_products.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fts.fts_products.entities.Company;
import com.fts.fts_products.entities.Product;
import com.fts.fts_products.repositories.ProductRepository;

@Service
public class ProductService {
  @Value("${fts-company.host}")
  private String companyHost;

  @Autowired
  private ProductRepository repository;

  @Autowired
  private RestTemplate restTemplate;

  public List<Product> findAll() {
    List<Product> list = repository.findAll();

    return list;
  }

  public Product geProductById(Long id) {
    Map<String, String> urlVariables = new HashMap<>();

    urlVariables.put("id", "1");

    Company company = restTemplate.getForObject(companyHost + "/companies/{id}", Company.class, urlVariables);

    if (company != null) {
      System.out.println(company.getName());
    }
    return repository.findById(id).get();
  }

}
