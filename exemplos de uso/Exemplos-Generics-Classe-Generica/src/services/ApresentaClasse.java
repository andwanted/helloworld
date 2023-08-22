package services;

import java.util.ArrayList;
import java.util.List;

public class ApresentaClasse<T> {

	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}

	public void apresentar() {
		System.out.print("[ ");
		if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(" " + list.get(i) + " do tipo: " + list.get(i).getClass() + " ");
			}
		}
		System.out.print(" ]");
	}

}
