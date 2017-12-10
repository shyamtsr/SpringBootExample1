package io.ssreddy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketBookingSystemDemo1Application /* implements CommandLineRunner */ {

	/*
	 * @Autowired private TicketBookingService service;
	 * 
	 * @Autowired private DataSource dataSource;
	 */

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingSystemDemo1Application.class, args);
	}

	/*
	 * @Override public void run(String... arg0) throws Exception { TicketDto
	 * ticketDto = new TicketDto(); ticketDto.setPassengerName("Shyamsundar Reddy");
	 * ticketDto.setBookingDate(new Date()); ticketDto.setSourceStation("Hyd");
	 * ticketDto.setDestStation("Tirupathi");
	 * ticketDto.setEmail("shyam.tr1@gmail.com");
	 * 
	 * service.createTicket(ticketDto);
	 * 
	 * System.out.println("DataSource : " + dataSource); }
	 */

}
