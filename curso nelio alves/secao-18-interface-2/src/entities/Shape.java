package entities;

import enums.*;

public abstract class Shape {
	protected Color color;

	public Shape(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double area() {
		return 0;

	}
}
