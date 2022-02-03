package com.details;
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

import com.details.Model.TicketFares;
import com.details.Repository.TicketFaresDAO;
import com.details.Service.TicketFaresService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TicketFaresTest {
	
	

	@Autowired
	private TicketFaresService Service;

	@MockBean
	private TicketFaresDAO repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void getTicketFaresAddTest() {
		when(repository.findAll()).thenReturn(
				Stream.of(new TicketFares(10012, 1000, 2000, 1500), new TicketFares(10030, 1005, 3000, 2456))
						.collect(Collectors.toList()));

		assertEquals(2, Service.findAllTicketFares().size());

	}

}
