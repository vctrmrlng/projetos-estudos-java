package exercicio_de_revisao;
import  java.util.Scanner;

public class Matematica1 {
	
	private int numero;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void gerarTabuada() {
		for (int i = 1; i <=10; i++) {
			System.out.println(this.numero + " x " + i + " = " + (this.numero*i));
		}
		}
	
	public void classificarNumero() {
		if (this.numero > 0)
			System.out.println(this.numero + " é positivo.");
		else if (this.numero> 0)
			System.out.println(this.numero + " é negativo.");
		else 
			System.out.println(this.numero + " é ZERO");
	}
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner (System.in);
		
		Matematica1 tabuada = new Matematica1 ();
		System.out.print("Entre com um numero: ");
		tabuada.numero = sc.nextInt();
		tabuada.classificarNumero();
		tabuada.gerarTabuada();
		
		sc.close();
	}

}
