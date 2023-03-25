package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Midia;
import entities.DVD;
import entities.CD;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Midia[] lista = new Midia[10];
		int op;

		for (int i = 0; i < 2; i++) {
			System.out.println("Digite 1 para CD e 2 para DVD");
			Scanner sc = new Scanner(System.in);
			op = sc.nextInt();
			if (1 == op) {
				lista[i] = new CD();
			} else {
				lista[i] = new DVD();
			}
			lista[i].inserirDados();
			for (int j = 0; i < 2; i++) {
				lista[j].printDados();
			}

			sc.close();
		}

	}

}
