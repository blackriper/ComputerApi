package com.blackriper.computerApi.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.UUID;

public record Computer(
        @JsonProperty("id_computer")
        UUID idComputer,
        String name,
        @JsonProperty("release_date")
        @JsonFormat(pattern = "dd/MM/yyyy")
        LocalDateTime releaseDate,
        String ram ,
        String disk,
        @JsonProperty("os_system")
        String osSystem,
        @JsonProperty("id_company")
        UUID idCompany
) {}
