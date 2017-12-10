package io.ssreddy.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.ssreddy.springboot.dao.TicketBookingDao;
import io.ssreddy.springboot.dto.TicketDto;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao bookingDao;

	public TicketDto createTicket(TicketDto ticketDto) {
		return bookingDao.save(ticketDto);
	}

	public TicketDto getTicket(Integer id) {
		return bookingDao.findOne(id);
	}

	public Iterable<TicketDto> getAllTicketDetails() {
		return bookingDao.findAll();
	}

	public void removeTicket(Integer id) {
		bookingDao.delete(id);
	}

	public TicketDto updateTicketDetails(Integer ticketId, String newEmail) {
		TicketDto findId = bookingDao.findOne(ticketId);
		findId.setEmail(newEmail);
		// boolean existsId = bookingDao.exists(ticketId);
		// TicketDto findId = new TicketDto();
		// findId.setEmail(newEmail);
		// TicketDto updateTicket = null;
		// if (existsId) {
		TicketDto updateTicket = bookingDao.save(findId);
		// }
		return updateTicket;
	}

}
