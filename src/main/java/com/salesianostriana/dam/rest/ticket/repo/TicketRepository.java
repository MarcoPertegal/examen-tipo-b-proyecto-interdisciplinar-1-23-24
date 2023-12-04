package com.salesianostriana.dam.rest.ticket.repo;

import com.salesianostriana.dam.rest.ticket.dto.GetTicketDto;
import com.salesianostriana.dam.rest.ticket.model.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    @Override
    Page<Ticket> findAll(Pageable pageable);

    /*
    @Query(
            """
            SELECT com.salesianostriana.dam.rest.ticket.dto.GetTicketDto of(
                id,
                title,
                deadline
            )
            FROM ticket
            """
    )
    Page<GetTicketDto> findAllTicketDto(Pageable pageable);*/
}
