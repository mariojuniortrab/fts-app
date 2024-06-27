package com.fts.fts_companies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fts.fts_companies.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
