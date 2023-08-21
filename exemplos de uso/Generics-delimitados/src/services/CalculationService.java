package services;

import java.util.List;

public class CalculationService {

	public static Double max(List<Double> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("A lista não pode ser vazia");
		}
		Double max = list.get(0);
		for (Double item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}

}
