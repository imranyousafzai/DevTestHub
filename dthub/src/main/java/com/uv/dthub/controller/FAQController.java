package com.uv.dthub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uv.dthub.model.FAQ;
import com.uv.dthub.service.FAQService;

@RestController
@RequestMapping("/faq")
public class FAQController {

    @Autowired
    private FAQService faqService;

    @PostMapping
    public ResponseEntity<FAQ> createdFAQ(@RequestBody FAQ faq) {
    	FAQ createdFAQ = faqService.createFAQ(faq);
        return new ResponseEntity<>(createdFAQ, HttpStatus.CREATED);
    }
     
}
