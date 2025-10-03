//1.	Crie a classe Departamento (não executável) com os seguintes atributos privados:
//o	String nome
//o	String localizacao
//o	Construtor que inicializa os atributos.
//2.	Crie 2 métodos públicos: getNome() e GetLOcalizacao()

package Livraria;

public class Departamento {
	private String name;
	private String localizacao;
	
	Departamento (String name, String local) {
		this.name = name;
		this.localizacao = local;
		}

	public String getName() {
		return name;
	}

	public String getLocalizacao() {
		return localizacao;
	}

}
