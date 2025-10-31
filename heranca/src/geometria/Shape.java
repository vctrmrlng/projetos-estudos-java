package geometria;

public abstract class Shape {
	String nome;
	int numLados;
	
	Shape (String nomeShape, int ladosShape) {
		this.nome = nomeShape;
		this.numLados = ladosShape;
		}
	
	public abstract double getPerimetro();
	public abstract double getArea();
	
	public void displayDados() {
		System.out.println("Forma: " + this.nome +"\nNumero de Lados: " + this.numLados);
		System.out.println("Área: " + this.getArea());
		System.out.println("Perímetro:" + this.getPerimetro());
	}
	

}
