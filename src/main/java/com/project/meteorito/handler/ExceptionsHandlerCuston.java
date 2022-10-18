package com.project.meteorito.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ExceptionsHandlerCuston {
	
  	@ExceptionHandler(ExceptionsErroImpact.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
  	public ModelErro returnError(ExceptionsErroImpact ex, WebRequest request) {
  		
  		ModelErro error = new ModelErro(
  				HttpStatus.NO_CONTENT.value()
  				,new Date(),
  				ex.getMessage(),
  				request.getDescription(false));
  		
		return error;
  	}
  		
		 
		@ExceptionHandler(Exception.class)
		@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	  	public ModelErro returnError(Exception ex, WebRequest request) {
	  		
	  		ModelErro error = new ModelErro(
	  				HttpStatus.INTERNAL_SERVER_ERROR.value()
	  				,new Date(),
	  				ex.getMessage(),
	  				request.getDescription(false));
	  		
			return error;
	  		
  	}
}
