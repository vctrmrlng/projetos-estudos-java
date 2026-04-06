package parte1;

public class Aluno {
	private String nome;
	private int numeroCadastro;
	

	public Aluno(String nome, int numeroCadastro) {
		this.nome = nome;
		this.numeroCadastro = numeroCadastro;
	}

	public void exibirDados() {
		System.out.println("Aluno padrão: Nome = " + nome + " ID = " + numeroCadastro);
	}
}