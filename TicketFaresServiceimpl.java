package com.details.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.details.Model.TicketFares;
import com.details.Repository.TicketFaresDAO;



@Service
public class TicketFaresServiceimpl implements TicketFaresService {
	@Autowired
	TicketFaresDAO dao;

	@Override
	public TicketFares addTicketFares(TicketFares TicketFares) {
		TicketFares emp=dao.save(TicketFares);
		return emp;
	}

	@Override
	public List<TicketFares> findAllTicketFares() {
		List<TicketFares> emp=dao.findAll();
		return emp;
	}

	
}