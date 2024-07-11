package com.example.ticketmanagement.repository;

import com.example.ticketmanagement.model.Ticket;
import com.example.ticketmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByUser(User user);
}
