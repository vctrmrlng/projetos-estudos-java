package parte2;

public class Aluno {
	private String nome;
	private int numeroCadastro;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroCadastro() {
		return numeroCadastro;
	}

	public void setNumeroCadastro(int numeroCadastro) {
		this.numeroCadastro = numeroCadastro;
	}


	public Aluno(String nome, int numeroCadastro) {
		this.nome = nome;
		this.numeroCadastro = numeroCadastro;
	}

	public void exibirDados() {
		System.out.println("Aluno padrão: Nome = " + nome + " ID = " + numeroCadastro);
	}
}