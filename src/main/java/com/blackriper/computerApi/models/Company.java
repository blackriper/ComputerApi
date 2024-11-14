package com.blackriper.computerApi.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record Company(
        UUID id,
        String name,
        String founder,
        @JsonProperty("created_at")
        @JsonFormat(pattern = "dd/MM/yyyy")
        LocalDateTime createdAt,
        List<Computer> computers
) {}
