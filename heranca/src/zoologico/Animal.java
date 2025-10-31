package zoologico;

public class Animal {
	String nome;
	String familia;
	
	Animal (String nomeAnimal, String familiaAnimal) {
		this.nome = nomeAnimal;
		this.familia = familiaAnimal;
	}
	
	public void fazerSom() {
	}
	
	public void exibirInfo() {
		System.out.println("Informações do Animal: ");
		System.out.println("Animal: " + this.nome + "\nFamília: " + this.familia);
		this.fazerSom();
		
	}
}
