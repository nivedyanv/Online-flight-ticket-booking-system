package com.details.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.details.Model.TicketFares;

public interface TicketFaresDAO extends JpaRepository<TicketFares,Integer>  {

	TicketFares save(TicketFares ticketFares);

	List<TicketFares> findAll();

}
