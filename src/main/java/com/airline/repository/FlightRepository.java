package com.airline.repository;



import com.airline.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // Add this annotation
public interface FlightRepository extends JpaRepository<Flight, Long> {
}

