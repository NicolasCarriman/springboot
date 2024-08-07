package com.nc.test_api.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.stereotype.Service;

import com.nc.test_api.domain.Custommer;

@Service
public class TestService {

    public List<Custommer> getTest() {
        return List.of(
                new Custommer(
                        1L,
                        "test222",
                        "test@example.net",
                        "test",
                        12,
                        LocalDate.of(2000, Month.JANUARY, 5)));
    }

}
