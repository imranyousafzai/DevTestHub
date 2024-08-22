package com.uv.dthub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uv.dthub.model.Test;
import com.uv.dthub.service.TestService;

@RestController
@RequestMapping("/tests")
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping
    public ResponseEntity<Test> createTest(@RequestBody Test test) {
    	Test createdTest = testService.createTest(test);
        return new ResponseEntity<>(createdTest, HttpStatus.CREATED);
    }
     
}
