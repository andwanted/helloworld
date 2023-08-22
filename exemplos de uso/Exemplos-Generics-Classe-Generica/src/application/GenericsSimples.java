package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import services.ApresentaClasse;

public class GenericsSimples {

	public static void main(String[] args) {
		
		ApresentaClasse apresentaClasse = new ApresentaClasse();
		
		apresentaClasse.addValue("Valor em String 1");
		apresentaClasse.addValue(1);
		
		apresentaClasse.apresentar();
	}



}
