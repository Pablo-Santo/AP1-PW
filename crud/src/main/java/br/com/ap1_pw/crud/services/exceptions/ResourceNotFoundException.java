package br.com.ap1_pw.crud.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		
		super("Usuário não encontrado, ID = " +id);
		
	}

}
