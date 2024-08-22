package com.uv.dthub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uv.dthub.model.Coin;
import com.uv.dthub.service.CoinService;

@RestController
@RequestMapping("/coins")
public class CoinController {

    @Autowired
    private CoinService coinService;

    @PostMapping
    public ResponseEntity<Coin> createCoin(@RequestBody Coin coin) {
        Coin createdCoin = coinService.createCoin(coin);
        return new ResponseEntity<>(createdCoin, HttpStatus.CREATED);
    }
     
}
