package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import entities.Carro;
import entities.Moto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		List<Carro> carros = new ArrayList<>();
		List<Moto> motos = new ArrayList<>();

		motos.add(new Moto("Twister", "Honda", "IHG-5231", 2020, 0.300));
		motos.add(new Moto("Hornet", "Honda", "FUN-1442", 2015, 0.600));
		motos.add(new Moto("Crosser", "Yahamaha", "IHG-4211", 2023, 0.300));
		carros.add(new Carro(4, "Corolla", "Toyota", "AB1C-3DE", 2022, 2.00));
		carros.add(new Carro(4, "Civic", "Honda", "B3R4-33A", 2021, 1.80));
		carros.add(new Carro(2, "Ka", "Ford", "PO21-K3E", 2022, 1.00));

		Collections.sort(carros);

		for (Carro c : carros) {
			System.out.println(c);
		}

	}

}
