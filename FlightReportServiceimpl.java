package com.details.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.details.Model.FlightReport;
import com.details.Model.FlightTypes;
import com.details.Repository.FlightReportDAO;



@Service
public class FlightReportServiceimpl implements FlightReportService {
	
	@Autowired
	FlightReportDAO dao;
  public FlightReport addFlightReport(FlightReport flightReport) {
		FlightReport e = dao.save(flightReport);
		return e;
	}

	@Override
	public List<FlightReport> findByflightnumber(int flightnumber) {
		List<FlightReport> a = dao.findByflightnumber(flightnumber);
		return a;
	}

	@Override
	public List<FlightReport> findByflightstatus(String flightstatus) {
		List<FlightReport> a = dao.findByflightstatus(flightstatus);
		return a;

	}

	@Override
	public List<FlightReport> findAll() {
		List<FlightReport> e = dao.findAll();
		return e;
	}

	@Override
	public FlightReport save(FlightReport flightreport) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlightReport updateFlightReport(FlightReport flightreport) {
		// TODO Auto-generated method stub
		return null;
	}
	
}