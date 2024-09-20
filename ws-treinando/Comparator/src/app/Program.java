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

		// Comparator objeto de classe anônima
		Comparator<Product> comp = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				// TODO Auto-generated method stub
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		
		list.sort(comp);

		for (

		Product p : list) {
			System.out.println(p);
		}
	}

}
