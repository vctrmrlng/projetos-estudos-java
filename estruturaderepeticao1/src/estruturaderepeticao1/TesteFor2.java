package estruturaderepeticao1;
import java.util.Scanner;

public class TesteFor2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com um valor de 1 a 10: ");
		int numero = sc.nextInt();
				
		for (int i=0;i<=10;i++) {
				System.out.println("" + numero + " x " + i + " = " + (i*numero));
			}
		}
	}

