package br.senac.edu.modelo.entidade.pessoa;

import br.senac.edu.modelo.excecao.pessoa.CPFInvalidoException;
import br.senac.edu.modelo.excecao.pessoa.IdadeInvalidaException;
import br.senac.edu.modelo.excecao.pessoa.NomeInvalidoException;

public abstract class Pessoa {
	
	private String nome;
	private byte idade;
	private String cpf;
	
	protected Pessoa(String nome, byte idade, String cpf) throws IdadeInvalidaException, NomeInvalidoException, CPFInvalidoException {
		super();
		setNome(nome);
		setIdade(idade);
		setCPF(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws NomeInvalidoException {
		if (nome.isBlank() && nome.length() < 3) {
			throw new NomeInvalidoException("O nome "+nome+" é invalido!");
		}
		this.nome = nome;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) throws IdadeInvalidaException {
		
		if (idade < 1 || idade > 99) {
			throw new IdadeInvalidaException("A idade "+idade+" é invalida!");
		}
		
		this.idade = idade;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) throws CPFInvalidoException {
		if(cpf.isBlank() || (cpf.length() != 11 && cpf.length() != 14)) {
			throw new CPFInvalidoException("O CPF "+cpf+" é invalido!");
		}
		this.cpf = cpf;
	}
}




















