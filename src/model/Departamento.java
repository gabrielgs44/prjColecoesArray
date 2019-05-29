package model;

public class Departamento {
	private String sigla, nome;
	private Empregado[] listaEmpregados;
	private Empregado gerente;
	
	public Departamento(String sigla, String nome, Empregado[] listaEmpregado, Empregado gerente) {
		this.sigla = sigla;
		this.nome = nome;
		this.listaEmpregados = new Empregado[100];
		this.gerente = gerente;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Empregado[] getListaEmpregado() {
		return listaEmpregados;
	}

	public void setListaEmpregado(Empregado[] listaEmpregado) {
		this.listaEmpregados = listaEmpregado;
	}

	public Empregado getGerente() {
		return gerente;
	}

	public void setGerente(Empregado gerente) {
		this.gerente = gerente;
	}
	
	public void addEmpregado(Empregado novoEmp, int i) {
		listaEmpregados[i] = novoEmp;
	}
	public void removeEmpregado(int exEmp) {
		listaEmpregados[exEmp] = null;
	}
}
