package exercicio_de_revisao;

public class Retangulo {
	public double altura;
	public double largura;
	
	Retangulo (double alt, double base) {
		this.altura = alt;
		this.largura = base;
	}
	
	public double calcularArea() {
		return (this.altura*this.largura);
	}
	
	public double calcularPerimetro () {
		return (2*(this.altura+this.largura));
	}
	
	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo (4.5 , 6);
		System.out.println("A área é de " + r1.calcularArea());
		System.out.println("O premímetro é de " +r1.calcularPerimetro());

	}

}
