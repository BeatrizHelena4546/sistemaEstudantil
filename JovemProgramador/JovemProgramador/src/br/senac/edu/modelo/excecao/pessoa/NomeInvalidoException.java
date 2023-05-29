package br.senac.edu.modelo.excecao.pessoa;
//toda classe de excecao que for criada deve herdar de RunTimeException
public class NomeInvalidoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9150257740232631677L;

	public NomeInvalidoException(String mensagem) {
		super(mensagem);
	}
}
