package Livraria;
import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com a altura em metros:");
		float altura = sc.nextFloat();
		System.out.println("Entre com o peso em kilogramas:");
		float peso = sc.nextFloat();
		float imc = peso/(altura*altura);
		System.out.println("O IMC é de " + imc);
		sc.close();
	}

}