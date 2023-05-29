package br.senac.edu.modelo.excecao.pessoa;

public class IdadeInvalidaException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3142901994183016940L;

	public IdadeInvalidaException(String mensagem) {
		super(mensagem);
	}
}
