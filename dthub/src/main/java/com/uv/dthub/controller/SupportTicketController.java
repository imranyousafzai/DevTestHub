package com.uv.dthub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uv.dthub.model.SupportTicket;
import com.uv.dthub.service.SupportTicketService;

@RestController
@RequestMapping("/supportTickets")
public class SupportTicketController {

    @Autowired
    private SupportTicketService supportTicketService;

    @PostMapping
    public ResponseEntity<SupportTicket> createSupportTicket(@RequestBody SupportTicket supportTicket) {
    	SupportTicket createdSupportTicket = supportTicketService.createSupportTicket(supportTicket);
        return new ResponseEntity<>(createdSupportTicket, HttpStatus.CREATED);
    }
     
}
