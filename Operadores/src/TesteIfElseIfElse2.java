
public class TesteIfElseIfElse2 {

	public static void main(String[] args) {
		double salario = 15600.00;
		double rate;
		double liquid;
	
	if (salario<= 2826.66) {rate = 0;
		}
	else if (salario<=3751.05) {rate = 0.15;
		}
	else if (salario<=4664.68) {rate = 0.225;
		}
	else rate = 0.275;
	
	liquid = salario - (salario*rate);
	
	
	System.out.println("O salário bruto é de " + salario);
	System.out.println("O imposto de renda é de " + (salario*rate));
	System.out.println("O salário liquido é de " + liquid);
	System.out.println(salario>=20000 ? "Salário de diretor" : "Salário de funcionário normal");
				
	}

}
