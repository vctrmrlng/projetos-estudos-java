
public class TipagemTriangulo {

	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		int c = 5;
	if (a+b<=c||a+c<=b||b+c<=a) {System.out.println("Não é um triangulo");
	} else if (a==b&&b==c) {
		System.out.println("Triângulo Equilátero");
	} else if (a==b||a==c||c==b) {
		System.out.println("Triângulo Isósceles");
	} else {System.out.println("Triângulo Escaleno");
	}

}
}
