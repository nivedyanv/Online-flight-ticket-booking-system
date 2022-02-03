package com.details.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.details.Model.FlightReport;

public interface FlightReportDAO extends JpaRepository<FlightReport, Integer>{

	FlightReport save(FlightReport flightReport);

	List<FlightReport> findAll();

	List<FlightReport> findByflightnumber(int flightnumber);

	List<FlightReport> findByflightstatus(String flightstatus);

}
