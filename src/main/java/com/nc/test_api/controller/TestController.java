package com.nc.test_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nc.test_api.domain.Custommer;
import com.nc.test_api.service.TestService;

@RestController
@RequestMapping(path = "/api/v1/test")
public class TestController {

    @Autowired
    private final TestService testService;
    
    public TestController() {
        this.testService = new TestService();
    }

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    public List<Custommer> getTest() {
        return testService.getTest();
    }
    
}
