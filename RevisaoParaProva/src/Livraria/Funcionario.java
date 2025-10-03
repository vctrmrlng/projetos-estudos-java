//3.	Crie a classe Funcionario (executável) com os seguintes atributos privados:
//o	String nome
//o	int matricula
//o	Departamento departamento (objeto da classe Departamento)
//o	Construtor que recebe todos os atributos.
//4.	Crie um método exibirFuncionario() que imprime os dados do funcionário e do departamento.
//5.	No método main, crie dois departamentos e três funcionários distribuídos entre eles.

package Livraria;

public class Funcionario {
	private String nome;
	private int matricula;
	private Departamento departamento;
	
	Funcionario (String nome, int matricula, Departamento departamento) {
		this.nome = nome;
		this.matricula = matricula;
		this.departamento = departamento;
	}

	public void exibirDetalhes () {
		System.out.println("\nFuncionario: " + this.nome);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Departamento:" + this.departamento.getName());
		System.out.println("Localização:" + this.departamento.getLocalizacao());
	}
	
	public static void main(String[] args) {
		Departamento financeiro = new Departamento ("Financeiro" , "4° Andar");
		Departamento juridico = new Departamento ("Jurídico" , "3° Andar");
		
		Funcionario func001 = new Funcionario ("José" , 47382 , financeiro);
		Funcionario func002 = new Funcionario ("Maria" , 95873 , financeiro);
		Funcionario func003 = new Funcionario ("Marcelo" , 26368 , juridico);
		
		func001.exibirDetalhes();
		func002.exibirDetalhes();
		func003.exibirDetalhes();

	}

}
