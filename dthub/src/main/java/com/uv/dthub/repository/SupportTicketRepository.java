package com.uv.dthub.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.uv.dthub.model.SupportTicket;

public interface SupportTicketRepository extends MongoRepository<SupportTicket, ObjectId> {
    List<SupportTicket> findByUserId(ObjectId userId);
}

