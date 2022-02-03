package com.details.Service;

import java.util.List;

import com.details.Model.FlightReport;



public interface FlightReportService {
	FlightReport addFlightReport(FlightReport FlightReport);
	
	List<FlightReport> findByflightnumber(int flightnumber);

	List<FlightReport> findByflightstatus(String flightstatus);

	

	List<FlightReport> findAll();

	FlightReport save(FlightReport flightreport);

	FlightReport updateFlightReport(FlightReport flightreport);

}
