package com.salesianostriana.dam.rest.ticket.exception;

import org.aspectj.bridge.Message;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponseException;

import java.util.Locale;

public class TicketNotFoundException /*extends ErrorResponseException*/ {
    /*
    public TicketNotFoundException ticketNotFoundException(){
        return super(HttpStatus.NOT_FOUND, of("Ticket no encontrado"));
    }

    @Override
    public ProblemDetail problemDetail(ProblemDetail problemDetail, Message message) {
        return ProblemDetail problemDetail = problemDetail.HttpStatus.NOT_FOUND
            .setTitle("Ticket no encontrado");
    }*/
}
