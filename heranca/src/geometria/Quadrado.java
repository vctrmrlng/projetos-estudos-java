package geometria;

public class Quadrado extends Shape{
	double lado;
	
	Quadrado (double tamLado){
		super("Quadrado", 4);
		this.lado = tamLado;
	}


	@Override
	public double getPerimetro() {
		double perimetro;
		perimetro = 4*this.lado;
		return(perimetro);
	}
	
	public double getArea() {
		double area = this.lado*this.lado;
		return(area);
	}
}