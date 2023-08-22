package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import services.ApresentaClasse;

public class GenericsSimples {

	public static void main(String[] args) {

		List<Integer> quantity = new ArrayList<>(List.of(1, 2, 3, 4, 5));

		System.out.println("Resultado da soma da lista é: " + calcular(quantity));

		List<Double> quantityDouble = new ArrayList<>(List.of(10.0, 20.0, 30.0, 40.0, 50.0));

		// Sem o uso de um método generico, meu método imprime apenas um tipo,
		// precisando criar outro serviço para imprimir tipos double
		System.out.println("Resultado da soma da lista é: " + calcular(quantityDouble));
		
	}
	
	//extender os tipos Number, só foi necessario devido a atribuição de += para a soma
	public static <T extends Number> double calcular(List<T> list) {

		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}

		double sum = 0.0;

		for (T l : list) {

			sum += l.doubleValue();
		}

		return sum;
	}

}
