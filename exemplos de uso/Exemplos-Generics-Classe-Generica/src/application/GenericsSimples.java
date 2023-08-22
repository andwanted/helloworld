package application;

import java.util.ArrayList;
import java.util.List;

public class GenericsSimples {

	public static void main(String[] args) {

		List<String> listString = new ArrayList<>(List.of("Maçã", "Pera", "Uva"));
		List<Integer> listInteger = new ArrayList<>(List.of(10, 23, 5));
		
		imprime(listString);
		//sem o uso de wildcards (tipo curinga) não conseguimos passar um outro tipo ao método
		imprime(listInteger);
		
	}

	public static void imprime(List<String> value) {

		for (String v : value) {
			System.out.println(v);
		}

	}

}
