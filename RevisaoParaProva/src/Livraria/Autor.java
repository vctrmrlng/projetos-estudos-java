package Livraria;

public class Autor {
	private String nome;
	private String nacionalidade;
	
	public String getNome() {
		return nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	Autor (String nomeAutor, String nacional) {
		this.nome = nomeAutor;
		this.nacionalidade = nacional;

	}
}
