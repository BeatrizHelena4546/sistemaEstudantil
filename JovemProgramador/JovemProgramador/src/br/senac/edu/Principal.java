package br.senac.edu;

import br.senac.edu.modelo.entidade.pessoa.empregado.Empregado;
import br.senac.edu.modelo.entidade.pessoa.empregado.diretor.Diretor;
import br.senac.edu.modelo.entidade.pessoa.empregado.professor.Professor;

public class Principal {

	public static void main(String[] args) {

		Empregado[] empregados = new Empregado[3];
		
		empregados[0] = new Professor("Joao", (byte)27, "123", null, "123456", 15f, null);
		empregados[1] = new Professor("Lucas", (byte)27, "345", null, "12346", 20f, null);
		empregados[2] = new Diretor("Maria", (byte)27, "567", "126", 55f, null);

		System.out.println("Relatorio :\n ");
		
		for(Empregado empregado : empregados) {
			System.out.println("Nome do empregado : "+empregado.getNome());
			System.out.println("Salario do empregado : "+empregado.calcularSalario());
			System.out.println();
		}
	}
}