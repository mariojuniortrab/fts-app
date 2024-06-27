package com.fts.fts_companies.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fts.fts_companies.entities.Company;
import com.fts.fts_companies.repositories.CompanyRepository;

@Service
public class CompanyService {

  @Autowired
  private CompanyRepository repository;

  public List<Company> findAll() {
    List<Company> list = repository.findAll();

    return list;
  }

  public Company getCompanyById(Long id) {
    Company company = repository.findById(id).get();

    return company;
  }
}
