package io.ssreddy.springboot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.ssreddy.springboot.dto.TicketDto;

@Repository
public interface TicketBookingDao extends CrudRepository<TicketDto, Integer> {

}
