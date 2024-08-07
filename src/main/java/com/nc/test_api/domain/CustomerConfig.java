package com.nc.test_api.domain;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nc.test_api.reporsitory.CustomerRepository;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository) {
        return args -> {

            Custommer pablo = new Custommer(
                    1L,
                    "pablo",
                    "pablo.gmail.com",
                    "test",
                    LocalDate.of(2000, Month.JANUARY, 6));
            Custommer test = new Custommer(
                    2L,
                    "test",
                    "test.gmail.com",
                    "test",
                    LocalDate.of(2000, Month.JANUARY, 6));
            repository.saveAll(
                List.of(pablo, test)
                );
        };
    }
}
