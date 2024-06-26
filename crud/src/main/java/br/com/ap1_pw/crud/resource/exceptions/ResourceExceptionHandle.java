package br.com.ap1_pw.crud.resource.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import br.com.ap1_pw.crud.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandle {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
	
		String erroMsg = "Infomação não encontrada";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError erroPadrao = new StandardError(Instant.now(), status.value(), erroMsg, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(erroPadrao);
	}
	
}
