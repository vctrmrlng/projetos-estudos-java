package exercicios;

import java.util.Arrays;
import java.util.Scanner;
@SuppressWarnings("unused")

public class exercicio2 {
	
	public static void main(String[] args) {
		String[] nomes = new String[5];
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			System.out.println("Digite um nome para adicionar à lista");
			nomes[i]=sc.nextLine();
}
		sc.close();
		Arrays.sort(nomes);
		System.out.println(Arrays.toString(nomes));
}
}