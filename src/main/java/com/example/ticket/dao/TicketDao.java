package com.example.ticket.dao;

import com.example.ticket.model.Ticket;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TicketDao extends CrudRepository<Ticket,Integer> {



}

