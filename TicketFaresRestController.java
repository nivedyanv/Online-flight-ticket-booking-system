package com.details.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.details.Model.FlightTypes;
import com.details.Model.TicketFares;
import com.details.Service.FlightTypesService;
import com.details.Service.TicketFaresService;

@RestController
public class TicketFaresRestController {
	
	@Autowired
	TicketFaresService  service;
	@PostMapping("/Ticketfares")
	public ResponseEntity<TicketFares> createDetails(@Validated @RequestBody TicketFares ticketfares){
		
		System.out.println("Rest");
		TicketFares e= service.addTicketFares(ticketfares);
		System.out.println(e);
		return new ResponseEntity<TicketFares>(e,HttpStatus.OK);
	}
	@GetMapping("/Ticketfares")
	public ResponseEntity<List <TicketFares>> fetchDetails(){
		//System.out.println("alll");
		List<TicketFares> e=service.findAllTicketFares();
		return ResponseEntity.ok().body(e);
	}
	
}