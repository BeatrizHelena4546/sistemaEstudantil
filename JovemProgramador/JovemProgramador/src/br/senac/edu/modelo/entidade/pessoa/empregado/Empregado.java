package br.senac.edu.modelo.entidade.pessoa.empregado;

import br.senac.edu.modelo.entidade.pessoa.Pessoa;
import br.senac.edu.modelo.enumeracao.gestor.Status;
import br.senac.edu.modelo.excecao.pessoa.CPFInvalidoException;
import br.senac.edu.modelo.excecao.pessoa.IdadeInvalidaException;
import br.senac.edu.modelo.excecao.pessoa.NomeInvalidoException;

public abstract class Empregado extends Pessoa {
	private String ctps;
	private float valorHora;
	private Status status;
	
	protected Empregado(String nome, byte idade, String cpf, String ctps, float valorHora, Status status) throws IdadeInvalidaException, NomeInvalidoException, CPFInvalidoException {
		super(nome, idade, cpf);
		setCtps(ctps);
		setValorHora(valorHora);
		setStatus(status);
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	public abstract float calcularSalario();
	
	public float calcularSalario(int qtdHorasTrab) {
		return qtdHorasTrab * valorHora;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
}
