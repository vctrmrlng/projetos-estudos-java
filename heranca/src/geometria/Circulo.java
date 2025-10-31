package geometria;

public class Circulo extends Shape{
	double raio;
	Circulo (double raioCir) {
		super("Circulo", 0);
		this.raio=raioCir;
		
	}
	
	@Override
	public double getPerimetro() {
		double perimetro;
		perimetro = 2*this.raio*Math.PI;
		return(perimetro);
	}
	
	public double getArea() {
		double area = this.raio*this.raio*Math.PI;
		return(area);
	}
}