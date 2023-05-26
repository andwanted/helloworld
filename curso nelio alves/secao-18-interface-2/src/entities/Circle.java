package entities;

import enums.Color;

public class Circle extends AbstractShape {

	private double raio;

	public Circle(Color color, double raio) {
		super(color);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return Math.PI * raio * raio;
	}

}
