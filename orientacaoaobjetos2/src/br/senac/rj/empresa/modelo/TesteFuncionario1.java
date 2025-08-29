package br.senac.rj.empresa.modelo;

public class TesteFuncionario1 {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		func1.registro = 331;
		func1.nome = "Alberto";
		func1.cargo = 2;
		func1.salario = 5000.00;
		
		System.out.println("Salário base de " + func1.nome + " é de " + func1.salario );
		System.out.println("O cargo de " + func1.nome + " é " + func1.cargo + " e o registro é " +func1.registro);
		double bonificacao = func1.aplicarBonificacao();
		System.out.println("A bonificação é de " + bonificacao);
		System.out.println("O salário com bonificação é " + func1.salario);

	}
}