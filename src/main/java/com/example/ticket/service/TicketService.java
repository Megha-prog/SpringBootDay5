package com.example.ticket.service;

import com.example.ticket.model.Ticket;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public interface TicketService {
    String bookTicket(List<Ticket> tickets);



    Optional<Ticket> findById(int ticketId);


    List<Ticket> getTickets();
}
