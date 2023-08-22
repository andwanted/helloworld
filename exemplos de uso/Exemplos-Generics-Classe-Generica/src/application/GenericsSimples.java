package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import services.ApresentaClasse;

public class GenericsSimples {

	public static void main(String[] args) {

		List<Integer> quantity = new ArrayList<>(List.of(1,2,3,4,5));
		
		System.out.println("Resultado da soma da lista é: " +  calcular(quantity));
		
		List<Double> quantityDouble = new ArrayList<>(List.of(10.0,20.0,30.0,40.0,50.0));
		
		//Sem o uso de um método generico, meu método imprime apenas um tipo, precisando criar outro serviço para imprimir tipos double
		System.out.println("Resultado da soma da lista é: " +  calcularDouble(quantityDouble));
		
	}

	public static Integer calcular(List<Integer> list) {

		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}

		Integer sum = list.get(0);

		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}

		return sum;
	}
	
	public static Double calcularDouble(List<Double> list) {

		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}

		Double sum = list.get(0);

		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}

		return sum;
	}

}
