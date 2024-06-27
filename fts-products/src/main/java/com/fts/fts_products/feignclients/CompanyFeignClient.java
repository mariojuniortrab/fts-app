package com.fts.fts_products.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fts.fts_products.entities.Company;

@Component
@FeignClient(name = "fts-companies", path = "/companies")
public interface CompanyFeignClient {

  @GetMapping(value = "/{companyId}")
  ResponseEntity<Company> GetById(@PathVariable Long companyId);
}
