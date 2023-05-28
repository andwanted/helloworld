package application;

import entities.Printer;
import entities.Scanner;

public class Program {

	public static void main(String[] args) {

		Printer print = new Printer("SERIES-P810");
		print.processDoc("My Email");
		print.print("Documento - 0023");
		
		Scanner scan = new Scanner("SERIES-SC932");
		scan.processDoc("Carta documento");
		System.out.println("Documento scaneado: " + scan.scan());
		
	}
}
