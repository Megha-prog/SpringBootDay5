package com.example.ticket.controller;

import com.example.ticket.model.Ticket;
import com.example.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TicketController {
    @Autowired

    private TicketService ticketService;



    @PostMapping("/bookTickets")
    public String bookTickets(@RequestBody List<Ticket> tickets){
        return ticketService.bookTicket(tickets);
    }
    // Read operation

    @GetMapping("/getTickets")
    public List<Ticket> bookTickets(){
        return ticketService.getTickets();
    }

//    @GetMapping("/getTicket/{id}")
//    public List<Ticket> bookTickets(){
//        return ticketService.getTicketsById();
//    }



}
