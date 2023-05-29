package br.senac.edu.modelo.entidade.pessoa.empregado.diretor;

import br.senac.edu.modelo.entidade.pessoa.empregado.Empregado;
import br.senac.edu.modelo.enumeracao.gestor.Status;
import br.senac.edu.modelo.excecao.pessoa.CPFInvalidoException;
import br.senac.edu.modelo.excecao.pessoa.IdadeInvalidaException;
import br.senac.edu.modelo.excecao.pessoa.NomeInvalidoException;

public class Diretor extends Empregado{
	
	public Diretor(String nome, byte idade, String cpf, String ctps, float valorHora, Status status) throws IdadeInvalidaException, NomeInvalidoException, CPFInvalidoException {
		super(nome, idade, cpf, ctps, valorHora, status);
	}

	public float calcularSalario() {
		return 2500;
	}
	
	public void contratarEmpregado(Empregado empregado) {
		empregado.setStatus(Status.CONTRATADO);
	}
	
	public void demitirEmpregado(Empregado empregado) {
		empregado.setStatus(Status.DEMITIDO);
	}
}
