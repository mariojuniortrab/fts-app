package com.fts.fts_companies.resources;

import org.springframework.web.bind.annotation.RestController;

import com.fts.fts_companies.entities.Company;
import com.fts.fts_companies.services.CompanyService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/companies")
public class CompanyResource {

  private static Logger logger = LoggerFactory.getLogger(CompanyResource.class);

  @Autowired
  private CompanyService service;

  @GetMapping
  public ResponseEntity<List<Company>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }

  @Autowired
  private Environment env;

  @GetMapping(value = "/{companyId}")
  public ResponseEntity<Company> GetById(@PathVariable Long companyId) {
    logger.info("PORT = " + env.getProperty("local.server.port"));
    return ResponseEntity.ok(service.getCompanyById(companyId));
  }

}
