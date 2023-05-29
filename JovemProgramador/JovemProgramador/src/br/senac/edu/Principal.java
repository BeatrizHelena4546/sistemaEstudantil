package br.senac.edu;

import br.senac.edu.modelo.entidade.pessoa.empregado.Empregado;
import br.senac.edu.modelo.entidade.pessoa.empregado.diretor.Diretor;
import br.senac.edu.modelo.entidade.pessoa.empregado.professor.Professor;
import br.senac.edu.modelo.excecao.pessoa.CPFInvalidoException;
import br.senac.edu.modelo.excecao.pessoa.IdadeInvalidaException;
import br.senac.edu.modelo.excecao.pessoa.NomeInvalidoException;

public class Principal {

	public static void main(String[] args) {

		try {
			Empregado[] empregados = new Empregado[3];
			
			empregados[0] = new Professor("Joao", (byte)27, "109.203.859-07", null, "123456", 15f, null);
			empregados[1] = new Professor("Lucas", (byte)27, "109.203.859.14", null, "12346", 20f, null);
			empregados[2] = new Diretor("Maria", (byte)27, "003.828.139-28", "126", 55f, null);
			
			System.out.println("Relatorio :\n ");
			
			for(Empregado empregado : empregados) {
				System.out.println("Nome do empregado : "+empregado.getNome());
				System.out.println("Salario do empregado : "+empregado.calcularSalario());
				System.out.println("CPF : "+empregado.getCPF());
				System.out.println();
			}
		}
		catch(NomeInvalidoException exception) {
			System.out.println(exception.getMessage());
			exception.printStackTrace();
		}
		catch(IdadeInvalidaException exception) {
			System.out.println(exception.getMessage());
			exception.printStackTrace();
		}
		catch(CPFInvalidoException exception) {
			System.out.println(exception.getMessage());
			exception.printStackTrace();
		}
		finally {
			System.out.println("Entrei");
		}
		
		
		
		
		
	}
}