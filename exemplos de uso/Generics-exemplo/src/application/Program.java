package application;


import services.PrintServiceDouble;

public class Program {

	public static void main(String[] args) {
		
		PrintServiceDouble ps = new PrintServiceDouble();
		ps.addValue(10.0);
		ps.addValue(32.5);
		ps.addValue(5.50);
		
		ps.print();
		
	}

}
