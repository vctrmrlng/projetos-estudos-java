package br.senac.rj.empresa.modelo;

public class Funcionario {

	private int registro;
	private String nome;
	private int cargo;
	private double salario;
	
	public double aplicarBonificacao () {
		double taxa;
		if (this.cargo == 1) {taxa=0.2;}
		else if (this.cargo == 2) {taxa=0.4;}
		else if (this.cargo == 3) {taxa=0.6;}
		else {taxa=0;}
		
		double bonificacao = this.salario*taxa;
		this.salario = salario + bonificacao;
		return bonificacao;
		
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}