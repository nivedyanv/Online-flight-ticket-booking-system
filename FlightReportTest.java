package com.details;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.details.Model.FlightReport;
import com.details.Model.FlightTypes;
import com.details.Repository.FlightReportDAO;
import com.details.Service.FlightReportService;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightReportTest{ 
	@Autowired
	private FlightReportService Service;
	
	@MockBean
	private FlightReportDAO repository;
	
	@Test
	public void FlightReportAddTest() {
		when(repository.findAll())
		.thenReturn(Stream.of(new FlightReport("on air", 8,10090)).collect(Collectors.toList()));

assertEquals(1, Service.findAll().size());
	}
	@Test
	public void getfindByflightnumber() {
		int flightnumber= 100040;
		when(repository.findByflightnumber(flightnumber))
		.thenReturn(Stream.of(new FlightReport (100060)).collect(Collectors.toList()));

assertEquals(1, Service.findByflightnumber(flightnumber).size());

}
	@Test
	public void getfindByflightstatus() {
		String flightstatus="on waiting";
		when(repository.findByflightstatus(flightstatus))
		.thenReturn(Stream.of(new FlightReport("on waiting")).collect(Collectors.toList()));

assertEquals(1, Service.findByflightstatus(flightstatus).size());
		
	}
}
