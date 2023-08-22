package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import services.ApresentaClasse;

public class GenericsSimples {

	public static void main(String[] args) {
		
		ApresentaClasse apresentaClasse = new ApresentaClasse();
		apresentaClasse.addValue("Valor 1");
		apresentaClasse.addValue("Valor 2");
		apresentaClasse.addValue("Valor 3");
		
		apresentaClasse.addValue(1);
		apresentaClasse.addValue(2);
		apresentaClasse.addValue(3);
		
		apresentaClasse.apresentar();
	}



}
