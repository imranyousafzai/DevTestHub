package com.uv.dthub.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.uv.dthub.model.Test;

public interface TestRepository extends MongoRepository<Test, ObjectId> {
    List<Test> findByGameId(ObjectId gameId);
    List<Test> findByTesterId(ObjectId testerId);
}

