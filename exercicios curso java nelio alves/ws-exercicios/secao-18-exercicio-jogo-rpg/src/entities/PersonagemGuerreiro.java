package entities;

public class PersonagemGuerreiro extends Personagem implements Atacante{

	public PersonagemGuerreiro(String nome, int pontosDeVida) {
		super(nome, pontosDeVida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		System.out.println(nome + " atacando");
		System.out.println(" ATACAR!!!! ");
	}

	
	
}
