package com.areg.tickets.controllers;

import com.areg.tickets.models.Ticket;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/tickets")
public class TicketsController {

    @GetMapping("/tickets")
    public ResponseEntity<List<Ticket>> findAllTickets(){
        return null;
    }
    @GetMapping("/ticket")
    public ResponseEntity<Ticket> findTicket(@Param("id") String id){
        return null;
    }
    @PostMapping
    public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket){
        return null;
    }
    @PutMapping
    public ResponseEntity<Ticket> updateTicket(@RequestBody Ticket ticket){
        return null;
    }
    @DeleteMapping
    public ResponseEntity<Void> deleteTicket(@Param("id") String id){
        return null;
    }
}
