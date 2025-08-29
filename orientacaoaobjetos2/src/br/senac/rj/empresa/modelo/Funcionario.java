package br.senac.rj.empresa.modelo;

public class Funcionario {

	public int registro;
	public String nome;
	public int cargo;
	public double salario;
	
	public double aplicarBonificacao () {
		double taxa;
		if (cargo == 1) {taxa=0.2;}
		else if (cargo == 2) {taxa=0.4;}
		else if (cargo == 3) {taxa=0.6;}
		else {taxa=0;}
		
		double bonificacao = salario*taxa;
		salario = salario + bonificacao;
		return bonificacao;
		
	}
		

}