package exerciciosCasa;
import java.util.Scanner;

public class CalculadoraSimples {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com um valor inteiro: ");
		int numero1 = sc.nextInt();
		System.out.print("Entre com outro valor inteiro: ");
		int numero2 = sc.nextInt();
		System.out.println("Escolha uma operação - Digite:");
		System.out.println("+ (somar os dois números)");
		System.out.println("- (diferença entre dois números (maior pelo menor)");
		System.out.println("* (produto entre dois números)");
		System.out.println("/ (divisão entre dois números - primeiro pelo segundo)");
		System.out.println("S ou s (SAIR)");
		String operacao = sc.next();
				
		Double resultado = null;
		
		if (operacao.equals("+")) {resultado=(double)numero1+numero2;}
		else if (operacao.equals("-")) {resultado=(double)numero1-numero2;}
		else if (operacao.equals("*")) {resultado=(double)numero1*numero2;}
		else if (operacao.equals("/")&&numero2==0) {System.out.println("Não é possivel dividir por zero");}
		else if (operacao.equals("/")) {resultado=(double)numero1/numero2;}
		else if (operacao.equalsIgnoreCase("sair")) {System.out.println("Saindo");}
		else {System.out.println("Operação Invalida");}
		
		if (resultado != null) {System.out.println(resultado);
}
}
}