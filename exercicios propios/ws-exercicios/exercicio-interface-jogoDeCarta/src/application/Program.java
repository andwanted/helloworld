package application;

import entities.Carta;
import entities.CartaNormal;
import entities.CartaEspecial;
import entities.CartaMagica;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartaNormal c1 = new CartaNormal("Carta Normal", "Esta carta não possui efeito");
		CartaEspecial c2 = new CartaEspecial("Carta Especial", "Esta Carta Contem Poderes Especiais!");
		CartaMagica c3 = new CartaMagica("Carta Magica", "Esta Carta é Especial!");
		
		c1.jogar();
		c2.jogar();
		c3.jogar();
		
	}

}
