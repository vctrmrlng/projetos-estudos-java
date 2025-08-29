public class Baskara {

	public static void main(String[] args) {
		double a = 1;
		double b = 17;
		double c = 12;
		double delta = b*b-4*(a*c);
		double raizpos;
		double raizneg;
  		String texto;
		
		if (a==0||delta<0) {texto=("Impossível calcular");
		}
		else if (delta==0) {raizpos=(-b+Math.sqrt(delta))/(2 *a);
		texto=("A raiz é " + raizpos);
		}
		else {raizpos=(-b+Math.sqrt(delta))/(2 *a);
			  raizneg=(-b-Math.sqrt(delta))/(2 *a);
			  texto=String.format("As raízes são %.5f e %.5f", raizpos, raizneg);
		}
System.out.println(texto);
}
}