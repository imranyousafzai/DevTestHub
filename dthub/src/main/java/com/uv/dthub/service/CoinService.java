package com.uv.dthub.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uv.dthub.model.Coin;
import com.uv.dthub.repository.CoinRepository;

@Service
public class CoinService {

    @Autowired
    private CoinRepository coinRepository;

    public Coin createCoin(Coin coin) {
        return coinRepository.save(coin);
    }

    public List<Coin> getCoinByUserId(ObjectId userId) {
        return coinRepository.findByUserId(userId);
    }

    public Coin updateCoinBalance(ObjectId userId, int balance) {
		/*
		 * List<Coin> coinOptional = coinRepository.findByUserId(userId); if
		 * (coinOptional.isPresent()) { Coin coin = coinOptional.get();
		 * coin.setBalance(balance); return coinRepository.save(coin); }
		 */
        return null;
    }
}

