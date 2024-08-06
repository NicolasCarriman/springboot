package com.nc.test_api.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.stereotype.Service;

import com.nc.test_api.domain.TestEntity;

@Service
public class TestService {

    public List<TestEntity> getTest() {
        return List.of(
                new TestEntity(
                        1L,
                        "test222",
                        "test@example.net",
                        "test",
                        12,
                        LocalDate.of(2000, Month.JANUARY, 5)));
    }

}
