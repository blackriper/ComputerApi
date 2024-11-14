package com.blackriper.computerApi.models;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CompanyService {
  List<Company> getAllCompanies();
  Optional<Company>getCompanyByUUID(UUID id);
  Optional<Company> getCompanyByCreated(LocalDateTime createdAt);
  int deleteCompany(UUID id);
  Boolean updateCompany(UUID id , Company company);
  Company createCompany(Company company);
}
