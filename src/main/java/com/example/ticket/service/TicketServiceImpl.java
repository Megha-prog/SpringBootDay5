package com.example.ticket.service;


import com.example.ticket.dao.TicketDao;
import com.example.ticket.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketDao ticketDao;

    @Override
    public String bookTicket(List<Ticket> tickets) {

        // validation
        if (tickets.size() == 0 || tickets.isEmpty()) {
            return "Invalid request: ticket size is" + tickets.size();
        }

        ticketDao.saveAll(tickets);
        return "Successfully booked tickets" + tickets.size();
    }



    @Override
    public Optional<Ticket> findById(int  id) {
        return ticketDao.findById(id);
    }

    @Override
    public List<Ticket> getTickets() {
        return (List<Ticket>)ticketDao.findAll() ;
    }


}

