package com.details.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.details.Model.FlightReport;
import com.details.Service.FlightReportService;


@RestController
public class FlightReportRestController {
	@Autowired
	FlightReportService  service;
	@PostMapping("/flightreport")
	public ResponseEntity<FlightReport> createDetails(@Validated @RequestBody FlightReport flightreport){
		
		System.out.println("Rest");
		FlightReport e= service.addFlightReport(flightreport);
		System.out.println(e);
		return new ResponseEntity<FlightReport>(e,HttpStatus.OK);
	}
	@GetMapping("/flightreport")
	public ResponseEntity<List <FlightReport>> fetchDetails(){
		//System.out.println("alll");
		List<FlightReport> e=service.findAll();
		return ResponseEntity.ok().body(e);
	}
	@PutMapping("/flightreport/{flightstatus}")
	public ResponseEntity<FlightReport> updateFlightReport(@RequestBody FlightReport flightreport) {
		
//		try {
//			return new ResponseEntity<FlightReport>(service.save(flightreport), HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
		
		FlightReport e= service.updateFlightReport(flightreport);
	
		return new ResponseEntity<FlightReport>(e,HttpStatus.OK);
	}
}