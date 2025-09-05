package br.senac.rj.empresa.modelo;

public class TesteFuncionario1 {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		func1.setRegistro(331);
		func1.setNome("Alberto");
		func1.setCargo(2);
		func1.setSalario(5000.00);
		
		System.out.println("Salário base de " + func1.getNome() + " é de " + func1.getSalario() );
		System.out.println("O cargo de " + func1.getNome() + " é " + func1.getCargo() + " e o registro é " +func1.getRegistro());
		double bonificacao = func1.aplicarBonificacao();
		System.out.println("A bonificação é de " + bonificacao);
		System.out.println("O salário com bonificação é " + func1.getSalario());

	}
}