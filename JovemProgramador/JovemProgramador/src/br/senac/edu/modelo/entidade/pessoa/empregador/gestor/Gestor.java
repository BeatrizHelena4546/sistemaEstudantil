package br.senac.edu.modelo.entidade.pessoa.empregador.gestor;
import br.senac.edu.modelo.entidade.pessoa.empregado.Empregado;

public interface Gestor {

	void contratarEmpregador(Empregado empregado);
	
	void demitirEmpregado(Empregado empregado);
	

}
