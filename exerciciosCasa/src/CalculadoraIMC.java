import java.util.Scanner;
public class CalculadoraIMC {
				
		public double calcularIMC(double pesoKG, double alturaM) {
			return (pesoKG/(alturaM*alturaM));
		}
		public String classificar(double imc) {
			if (imc <= 18.5) 
				return ("Abaixo do peso");
			else if (imc <= 24.9) 
				return ("Peso Normal");
			else if (imc <= 29.9)
				return ("Sobrepeso");
			else if (imc <= 34.9)
				return ("Obesidade Grau I");
			else if (imc <= 39.9)
				return ("Obesidade Grau II");
			else
				return ("Obesidade Grau III (Mórbida)");
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			CalculadoraIMC calc = new CalculadoraIMC();
			double peso = 0;
			double altura =0;
			double imc;
			
			while (true) {
				System.out.print("Entre com seu peso (kg): ");
			}
			
}
}

