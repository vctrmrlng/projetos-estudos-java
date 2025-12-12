package parte4;

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
	
	public void efetuarPagamento() {
        System.out.println("Mensalidade padrão pendente. Valor sugerido: R$ 99,90");
    }
	
	public void efetuarPagamento(double valor) {
        System.out.println("Pagamento recebido no valor de R$ " + String.format("%.2f", valor));
    }
	
	public void efetuarPagamento(double valor, String metodo) {
        System.out.println("Pagamento recebido no valor de R$ " + String.format("%.2f", valor) + 
        				   "\nMétodo Utilizado: " + metodo);
    }
}