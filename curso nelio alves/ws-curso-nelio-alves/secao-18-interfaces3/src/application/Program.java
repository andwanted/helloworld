package application;

import entities.Printer;
import entities.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner1 = new Scanner();
		
		String doc = "Conteudo doc";
		
		scanner1.processDoc(doc);
		scanner1.scan();
		
		Printer printer1 = new Printer();
		printer1.processDoc(doc);
		printer1.print(doc);
		
	}

}
