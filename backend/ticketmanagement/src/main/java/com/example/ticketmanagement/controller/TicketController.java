package com.example.ticketmanagement.controller;

import com.example.ticketmanagement.model.Ticket;
import com.example.ticketmanagement.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    /**
     * Create a new ticket.
     *
     * @param ticket the ticket to create
     * @return the created ticket
     */
    @PostMapping
    public ResponseEntity<Ticket> create(@RequestBody @Valid Ticket ticket) {
        try {
            return new ResponseEntity<>(ticketService.createTicket(ticket), HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    /**
     * Get all tickets.
     *
     * @return a list of all tickets
     */
    @GetMapping
    public ResponseEntity<List<Ticket>> getAll() {
        return ResponseEntity.ok(ticketService.getAllTickets());
    }

    /**
     * Update a ticket.
     *
     * @param id the ticket ID to update
     * @param ticketDetails the updated ticket details
     * @return the updated ticket
     */
    @PutMapping("/{id}")
    public ResponseEntity<Ticket> update(@PathVariable Long id, @RequestBody @Valid Ticket ticketDetails) {
        try {
            return ResponseEntity.ok(ticketService.updateTicket(id, ticketDetails));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    /**
     * Delete a ticket.
     *
     * @param id the ticket ID to delete
     * @return a success response
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            ticketService.deleteTicket(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}