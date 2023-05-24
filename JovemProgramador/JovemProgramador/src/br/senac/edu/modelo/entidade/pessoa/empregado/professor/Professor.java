package br.senac.edu.modelo.entidade.pessoa.empregado.professor;

//import br.senac.edu.modelo.entidade.pessoa.Pessoa;
import br.senac.edu.modelo.entidade.pessoa.empregado.Empregado;
import br.senac.edu.modelo.entidade.turma.Turma;
import br.senac.edu.modelo.enumeracao.gestor.Status;

public class Professor extends Empregado {

	private Turma turma;

	public Professor(String nome, byte idade, String cpf, Turma turma, String ctps, float valorHora, Status status) {
		super(nome, idade, cpf, ctps, valorHora,status);
		setTurma(turma);
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public float calcularSalario() {
		return 1500;
	}

	public void fazerChamada() {
		System.out.println("Olha a chamada pessoal:");
	}
	
	public void contratarEmpregado(Empregado empregado) {
		empregado.setStatus(Status.CONTRATADO);
	}
	
}