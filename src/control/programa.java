package control;

import model.Departamento;
import model.Empregado;

public class programa {

	public static void main(String[] args) {
		
		String sigla = "RH";
		String dNome = "Recursos Humanos";
		
		Departamento depto  = new Departamento(sigla, dNome, null, null);
		
		String cpf = "111.111.111-90";
		String eNome = "Luiz Carlos";
		Empregado emp = new Empregado(cpf, eNome, depto);
		
		cpf = "222.222.222-90";
		eNome = "Maria Joana";
		
		Empregado emp2 = new Empregado (cpf, eNome, depto);
		
		depto.addEmpregado(emp, 0);
		depto.addEmpregado(emp2, 1);
		depto.setGerente(emp2);
		
		System.out.println("DEPARTAMENTO");
		System.out.println("Nome: " + depto.getNome());
		System.out.println("Sigla: " + depto.getSigla());
		System.out.println("Gerente: " + depto.getGerente().getNome());
		
		for(Empregado e: depto.getListaEmpregado()) {
			if(e == null) return;
			System.out.println(e.getNome());
		}
	}

}
