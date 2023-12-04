package com.salesianostriana.dam.rest.ticket.controller;

import com.salesianostriana.dam.rest.ticket.dto.GetTicketDto;
import com.salesianostriana.dam.rest.ticket.exception.TicketNotFoundException;
import com.salesianostriana.dam.rest.ticket.model.Ticket;
import com.salesianostriana.dam.rest.ticket.repo.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ticket")
@RequiredArgsConstructor
public class TicketController {

    private final TicketRepository ticketRepository;

    @GetMapping("/")
    public ResponseEntity<Page<Ticket>> getAll(@PageableDefault(page = 0, size = 6)Pageable pageable) {
        Page<Ticket> result = ticketRepository.findAll(pageable);
        if (result.isEmpty()) {
            //throw new TicketNotFoundException();
        }
        return ResponseEntity.ok(result);

    }


    @GetMapping("/{id}")
    public ResponseEntity<Ticket> getById(@PathVariable Long id) {
        Optional<Ticket> result = ticketRepository.findById(id);
        if (result.isEmpty()) {
            //throw new TicketNotFoundException();
        }
        return ResponseEntity.ok(result.get());

    }

    /*
    @GetMapping("/dto")
    public ResponseEntity<Page<GetTicketDto>> getAllDto(@PageableDefault(page = 0, size = 6)Pageable pageable) {
        Page<GetTicketDto> result = ticketRepository.findAllTicketDto(pageable);
        if (result.isEmpty()) {
           // throw new TicketNotFoundException();
        }
        return ResponseEntity.ok(result);
    }*/

}
