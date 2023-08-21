package application;

import java.util.ArrayList;
import java.util.List;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Double> listaExemplo = new ArrayList<>();
		listaExemplo.add(10.5);
		listaExemplo.add(5.2);
		listaExemplo.add(30.10);

		System.out.println(CalculationService.max(listaExemplo));
	}

}
