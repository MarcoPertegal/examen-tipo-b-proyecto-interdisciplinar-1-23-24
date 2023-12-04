package com.salesianostriana.dam.rest.error;

import org.springframework.boot.web.reactive.error.ErrorWebExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class GlobalRestController implements ErrorWebExceptionHandler {
}
