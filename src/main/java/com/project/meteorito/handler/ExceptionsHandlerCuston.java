package com.project.meteorito.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
public class ExceptionsHandlerCuston {
	
  	@ExceptionHandler(ExceptionsErroImpact.class)
  	public ModelErro returnError(ExceptionsErroImpact ex, WebRequest request) {
  		
  		ModelErro error = new ModelErro(
  				HttpStatus.NO_CONTENT.value()
  				,new Date(),
  				ex.getMessage(),
  				request.getDescription(false));
  		
		return error;
  		
  	}
}
