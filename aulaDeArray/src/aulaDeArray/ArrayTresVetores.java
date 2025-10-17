package aulaDeArray;

public class ArrayTresVetores {

	public static void main(String[] args) {
		String[] aluno = {"Alberto","Beatriz","Claudio","Daniele","Eduardo","Fabiana","Gabriel","Heloisa","Iuri","Julia"};
		String[] cidade = {"Rio de Janeiro","Niterói","Petrópolis","Teresópolis","Rio de Janeiro","Niterói","Petrópolis","Teresópolis","Rio de Janeiro","Niterói"};
		String[] cidades = {"Rio de Janeiro","Niterói","Petrópolis","Teresópolis"};
		int[] idade = {23,24,25,26,27,28,29,30,31,32};
		for (int j=0; j<=3; j++) {
			System.out.println();
			System.out.println(cidades[j] + ":");
			for (int i=0; i<10; i++) {
				if (cidade[i].equals( cidades[j])) {
					System.out.println(aluno[i]);
	
	}
	}
	}
		System.out.println();
		for (int j=0; j<4; j++) {
			int contador = 0;
			int soma = 0;
			for (int i=0; i<10; i++) {
				if (cidades[j].equals(cidade[i])) {
					soma = soma + idade[i];
					contador ++;
				}
				}
			System.out.println("A média das idades na cidade " + cidades[j] + " é " + soma/contador);}
	}
}
