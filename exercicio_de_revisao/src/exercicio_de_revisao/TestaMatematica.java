package exercicio_de_revisao;

import java.util.Scanner;

public class TestaMatematica {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Matematica tabuada1 = new Matematica();
		System.out.print("Entre com um número: ");
		tabuada1.numero = sc.nextInt();
		
		tabuada1.classificarNumero();
		tabuada1.gerarTabuada();
		
		
		Matematica1 tabuada2 = new Matematica1();
		System.out.print("Entre com um numero: ");
		int num1 = sc.nextInt();
		tabuada2.setNumero(num1);
		
		tabuada2.classificarNumero();
		tabuada2.gerarTabuada();
		
		sc.close();
	}

}
