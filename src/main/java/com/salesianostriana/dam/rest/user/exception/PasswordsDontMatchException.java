package com.salesianostriana.dam.rest.user.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponseException;

public class PasswordsDontMatchException extends ErrorResponseException {
    public PasswordsDontMatchException(HttpStatusCode status) {
        super(status);
    }

    public PasswordsDontMatchException(HttpStatusCode status, Throwable cause) {
        super(status, cause);
    }

    public PasswordsDontMatchException(HttpStatusCode status, ProblemDetail body, Throwable cause) {
        super(status, body, cause);
    }

    public PasswordsDontMatchException(HttpStatusCode status, ProblemDetail body, Throwable cause, String messageDetailCode, Object[] messageDetailArguments) {
        super(status, body, cause, messageDetailCode, messageDetailArguments);
    }
}
