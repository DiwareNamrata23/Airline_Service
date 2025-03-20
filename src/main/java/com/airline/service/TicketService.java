package com.airline.service;

import com.airline.entity.Flight;
import com.airline.entity.Ticket;
import com.airline.repository.FlightRepository;
import com.airline.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;
    private final FlightRepository flightRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository, FlightRepository flightRepository) {
        this.ticketRepository = ticketRepository;
        this.flightRepository = flightRepository;
    }

    // ✅ Book a ticket
    public Ticket bookTicket(Long flightId, String passengerName, String email) {
        Optional<Flight> flightOptional = flightRepository.findById(flightId);

        if (flightOptional.isEmpty()) {
            throw new RuntimeException("Flight not found");
        }

        Flight flight = flightOptional.get();
        Ticket ticket = new Ticket();
        ticket.setPassengerName(passengerName);
        ticket.setEmail(email);
        ticket.setFlight(flight);

        return ticketRepository.save(ticket);
    }

    // ✅ Get ticket by ID
    public Ticket getTicketById(Long ticketId) {
        return ticketRepository.findById(ticketId)
                .orElseThrow(() -> new RuntimeException("Ticket not found"));
    }

    // ✅ Cancel a ticket
    public void cancelTicket(Long ticketId) {
        if (!ticketRepository.existsById(ticketId)) {
            throw new RuntimeException("Ticket not found");
        }
        ticketRepository.deleteById(ticketId);
    }
}
