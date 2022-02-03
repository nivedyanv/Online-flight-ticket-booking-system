package com.details.Service;

import java.util.List;
import java.util.Optional;

import com.details.Model.TicketFares;



public interface TicketFaresService {
	public TicketFares addTicketFares(TicketFares TicketFares);
	public List<TicketFares> findAllTicketFares();
	

}
