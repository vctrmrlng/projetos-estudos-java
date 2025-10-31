package geometria;

public class main {

	public static void main(String[] args) {
		Quadrado poli001 = new Quadrado(5);
		Circulo poli002 = new Circulo(5);
		
		
		System.out.println(poli001.getArea());
		System.out.println(poli001.getPerimetro());
		System.out.println();
		System.out.println(poli002.getArea());
		System.out.println(poli002.getPerimetro());
	}
}