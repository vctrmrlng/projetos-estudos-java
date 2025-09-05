package orientacaoaobjetos3;

public class TesteClasseString {

	public static void main(String[] args) {
		String nome = "Roberto";
		int idade = 50;
		System.out.println("Nome = " + nome);
		char pos3 = nome.charAt(3);
		boolean vazio = nome.isBlank();
		System.out.println("4° caractér: " + pos3);
		System.out.println("String em Branco? " + vazio);
		System.out.println("Maiúsculo: " + nome.toUpperCase());
		System.out.println("Minúsculo: " + nome.toLowerCase());
		String idadeStr = String.valueOf(idade);
		System.out.println("Mais exemplos no Slide da aula");
	}

}
