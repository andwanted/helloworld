package application;


import entities.Personagem;
import entities.PersonagemGuerreiro;
import entities.PersonagemMago;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonagemGuerreiro guerreiro1 = new PersonagemGuerreiro("Warrior1", 0);
		PersonagemGuerreiro guerreiro2 = new PersonagemGuerreiro("Warrior2", 0);
		
		PersonagemMago mago1 = new PersonagemMago("Mage1", 0);
		PersonagemMago mago2 = new PersonagemMago("Mage2", 0);
		
		guerreiro1.atacar();
		guerreiro2.atacar();
		
		mago1.atacar();
		mago1.defender();
		mago2.atacar();
		mago1.defender();
		
		
	}

}
