package entities;

public class PersonagemMago extends Personagem implements Atacante, Defensivo {

	public PersonagemMago(String nome, int pontosDeVida) {
		super(nome, pontosDeVida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void defender() {
		// TODO Auto-generated method stub
		System.out.println(nome + " defendendo");
		System.out.println("Defender com magia!!!");
		System.out.println("Pontos de vida restante " + pontosDeVida);
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		System.out.println(nome + " atacando");
		System.out.println("Atacar com cajado magico!!");
	}

}
