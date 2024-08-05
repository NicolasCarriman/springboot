package com.nc.test_api;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nc.test_api.domain.TestEntity;

@SpringBootApplication
@RestController
public class TestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApiApplication.class, args);
	}

	@GetMapping
	public List<TestEntity> hello() {
		return List.of(
			new TestEntity(1L, "test222", "test@example.net", "test", 12, LocalDate.of(2000, Month.JANUARY, 5))
		);
	}
}
