package com.fts.fts_products.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fts.fts_products.entities.Company;

@Component
@FeignClient(name = "fts-companies", path = "/companies", fallback = CompanyFeignClientFallback.class)
public interface CompanyFeignClient {

  @GetMapping(value = "/{companyId}")
  ResponseEntity<Company> GetById(@PathVariable Long companyId);
}

@Component
class CompanyFeignClientFallback implements CompanyFeignClient {

  @Override
  public ResponseEntity<Company> GetById(Long companyId) {
    Company company = new Company(null, "Empty Company", null, null, null);
    return ResponseEntity.ok(company);
  }
}
