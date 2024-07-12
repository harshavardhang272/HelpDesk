package com.example.ticketmanagement.service;

import com.example.ticketmanagement.model.Ticket;
import com.example.ticketmanagement.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public Ticket updateTicket(Long id, Ticket ticketDetails) {
        Ticket ticket = ticketRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket not found"));

        ticket.setTitle(ticketDetails.getTitle());
        ticket.setDescription(ticketDetails.getDescription());
        ticket.setStatus(ticketDetails.getStatus());

        return ticketRepository.save(ticket);
    }

    public void deleteTicket(Long id) {
        Ticket ticket = ticketRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket not found"));
        ticketRepository.delete(ticket);
    }

    // Add more ticket-related methods as needed
}
