package exercicio_de_revisao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main (String[] args){
		
		Scanner sc = new Scanner (System.in);
		Random rd = new Random();
		int secreto = rd.nextInt(100) + 1;
		boolean acertou = false;
		
		for (int i = 1; i <=5; i++) {
			System.out.print("Entre com um numero de zero a 100):");
			int entrada = sc.nextInt();
			if (entrada==secreto) {System.out.println("Você acertou! " + entrada + " é o numero certo!");
				acertou = true;
				break;
			}
			else if (i<5) System.out.println("Tente novamente");
		}
		
		if (!acertou) System.out.println("O número era " + secreto);
			
		sc.close();
		}
	}