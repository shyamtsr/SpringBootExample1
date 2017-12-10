package io.ssreddy.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.ssreddy.springboot.dto.TicketDto;
import io.ssreddy.springboot.service.TicketBookingService;

@RestController
@RequestMapping(value = "/ticketbooking")
public class TicketBookingController {

	@Autowired
	private TicketBookingService bookingService;

	@PostMapping(value = "/createticket")
	public TicketDto createTicket(@RequestBody TicketDto ticketDto) {
		return bookingService.createTicket(ticketDto);
	}

	@GetMapping(value = "/ticket/{ticketId}")
	public TicketDto getTicket(@PathVariable("ticketId") Integer ticketId) {
		return bookingService.getTicket(ticketId);
	}

	@GetMapping(value = "/ticket/alltickets")
	public Iterable<TicketDto> getAllTicketDetails() {
		return bookingService.getAllTicketDetails();
	}

	@DeleteMapping(value = "/ticket/{ticketId}")
	public void removeTicket(@PathVariable("ticketId") Integer ticketId) {
		bookingService.removeTicket(ticketId);
	}

	@PutMapping(value = "/ticket/{ticketId}/{newEmail:.+}")
	public TicketDto updateTicketDetails(@PathVariable("ticketId") Integer ticketId,
			@PathVariable("newEmail") String newEmail) {
		return bookingService.updateTicketDetails(ticketId, newEmail);
	}

}
