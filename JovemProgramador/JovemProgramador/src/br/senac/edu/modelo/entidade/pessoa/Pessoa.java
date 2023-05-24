package br.senac.edu.modelo.entidade.pessoa;

public class Pessoa {
	private String nome;
	private byte idade;
	private String cpf;
	
	public Pessoa(String nome, byte idade, String cpf) {
		super();
		setNome(nome);
		setIdade(idade);
		setCPF(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
}
