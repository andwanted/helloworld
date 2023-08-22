package services;

import java.util.ArrayList;
import java.util.List;

public class ApresentaClasse {

	private List<String> list = new ArrayList<>();

	public void addValue(String value) {
		list.add(value);
	}

	public void apresentar() {
		System.out.print("[ ");
		if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(" " + list.get(i));
			}
		}
		System.out.print(" ]");
	}

}
