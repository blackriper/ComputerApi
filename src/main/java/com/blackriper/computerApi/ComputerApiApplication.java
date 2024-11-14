package com.blackriper.computerApi;

import com.blackriper.computerApi.models.Computer;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@SpringBootApplication
public class ComputerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputerApiApplication.class, args);
	}


//	@Bean
//	public CommandLineRunner runner(JdbcTemplate jdbcTemplate){
//		return args -> {
//		  jdbcTemplate.query("SELECT * from  computers WHERE id_computer= ?",
//				   (rs, rowNum) -> new Computer(UUID.fromString(rs.getString("id_computer")),rs.getString("name"), rs.getDate("release_date").toLocalDate().atStartOfDay(),rs.getString("ram"),rs.getString("disk"),rs.getString("os_system"),UUID.fromString(rs.getString("company_id"))),"660e8400-e29b-41d4-a716-446655440000").forEach(System.out::println);
//		};
//	}
}

