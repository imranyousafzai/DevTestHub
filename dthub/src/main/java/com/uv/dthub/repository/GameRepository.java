package com.uv.dthub.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.uv.dthub.model.Game;

public interface GameRepository extends MongoRepository<Game, ObjectId> {
	List<Game> findByDeveloperId(ObjectId developerId);

	List<Game> findByStatus(String status);
}
