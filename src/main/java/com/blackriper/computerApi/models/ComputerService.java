package com.blackriper.computerApi.models;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ComputerService {
    List<Computer> getComputerByCompanyID(UUID companyID);
    List<Computer>getComputerByRelease(LocalDateTime release);
    Optional<Computer>getComputerByID(UUID id);
    int deleteComputer(UUID id);
    Boolean updateComputer(UUID id , Computer computer);
}
