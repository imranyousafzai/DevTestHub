package com.uv.dthub.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uv.dthub.model.SupportTicket;
import com.uv.dthub.repository.SupportTicketRepository;

@Service
public class SupportTicketService {

    @Autowired
    private SupportTicketRepository supportTicketRepository;

    public SupportTicket createSupportTicket(SupportTicket supportTicket) {
        return supportTicketRepository.save(supportTicket);
    }

    public List<SupportTicket> getSupportTicketsByUserId(ObjectId userId) {
        return supportTicketRepository.findByUserId(userId);
    }

    public SupportTicket updateSupportTicketStatus(ObjectId ticketId, String status) {
        SupportTicket supportTicket = supportTicketRepository.findById(ticketId).orElse(null);
        if (supportTicket != null) {
            supportTicket.setStatus(status);
            return supportTicketRepository.save(supportTicket);
        }
        return null;
    }
}

