package com.fts.fts_companies.resources;

import org.springframework.web.bind.annotation.RestController;

import com.fts.fts_companies.entities.Company;
import com.fts.fts_companies.services.CompanyService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/companies")
public class CompanyResource {

  @Autowired
  private CompanyService service;

  @GetMapping
  public ResponseEntity<List<Company>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }

  @GetMapping(value = "/{companyId}")
  public ResponseEntity<Company> GetById(@PathVariable Long companyId) {
    return ResponseEntity.ok(service.getCompanyById(companyId));
  }

}
