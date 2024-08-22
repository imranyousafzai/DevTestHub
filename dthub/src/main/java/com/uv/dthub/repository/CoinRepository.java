package com.uv.dthub.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.uv.dthub.model.Coin;

public interface CoinRepository extends MongoRepository<Coin, ObjectId> {
	List<Coin> findByUserId(ObjectId userId);
}
