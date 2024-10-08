package app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<>();

		list.add(new Product("Dado", 20.00));
		list.add(new Product("Bola", 30.00));
		list.add(new Product("Tesoura", 10.00));

		// Comparator lambda direto no argumento				
		list.sort((p1,p2) ->p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (

		Product p : list) {
			System.out.println(p);
		}
	}

}
