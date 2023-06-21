package application;

import java.util.Locale;

import entities.Produtos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Produtos p1 = (new Produtos("Arroz", 5.0, 3));
		Produtos p2 = (new Produtos("Feijao", 6.0, 8));

		int resultado = p1.compareTo(p2);

		if (resultado > 0) {
			System.out.println("Produto 1 vem antes de Produto 2");
		} else if (resultado < 0) {
			System.out.println("Produto 1 vem após de Produto 2");
		} else {
			System.out.println("Estão na mesma posição");
		}
		System.out.println("saida: " + resultado);

	}
}
