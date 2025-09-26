import java.util.Scanner;

public class CalcSim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		double numero1 = sc.nextDouble();
		System.out.println("Digite outro número");
		double numero2 = sc.nextDouble();
		System.out.println("A soma dos número é " +(numero1+numero2));
		System.out.println("A subtração dos números é " + (numero1-numero2));
		System.out.println("O produto dos números é " + (numero1*numero2));
		if (numero2==0) {System.out.println("Impossivel dividir por zero");}
		else {System.out.println("A divisão entre os número é " + (numero1/numero2));}
	}

}
