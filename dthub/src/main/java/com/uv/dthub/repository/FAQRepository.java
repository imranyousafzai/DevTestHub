package com.uv.dthub.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.uv.dthub.model.FAQ;

public interface FAQRepository extends MongoRepository<FAQ, ObjectId> {
}
