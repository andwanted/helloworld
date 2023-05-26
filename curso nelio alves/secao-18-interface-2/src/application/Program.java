package application;

import entities.Circle;
import entities.Rectangle;
import enums.Color;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(Color.WHITE, 2.5);
		System.out.printf(c.getColor().name() + " " + String.format("%.2f",c.area()));
		System.out.println();
		Rectangle r = new Rectangle(Color.BLACK, 10.0, 5.1);
		System.out.printf(r.getColor().name() + " " + String.format("%.2f",r.area()));
		
	}

}
