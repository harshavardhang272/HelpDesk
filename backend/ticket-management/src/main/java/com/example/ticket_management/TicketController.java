package com.example.ticketmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @PutMapping("/{id}")
    public Ticket updateTicket(@PathVariable Long id, @RequestBody Ticket ticketDetails) {
        Ticket ticket = ticketRepository.findById(id).orElseThrow();
        ticket.setTitle(ticketDetails.getTitle());
        ticket.setDescription(ticketDetails.getDescription());
        ticket.setStatus(ticketDetails.getStatus());
        return ticketRepository.save(ticket);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
        Ticket ticket = ticketRepository.findById(id).orElseThrow();
        ticketRepository.delete(ticket);
    }
}
