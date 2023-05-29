package br.senac.edu.modelo.excecao.pessoa;

public class CPFInvalidoException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6935650092472085022L;

	public CPFInvalidoException(String mensagem) {
		super(mensagem);
	}
}
