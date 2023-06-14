package entities;

public abstract class Personagem {

	protected String nome;
	protected int pontosDeVida;

	public Personagem(String nome, int pontosDeVida) {
		this.nome = nome;
		this.pontosDeVida = 100;
	}
	
	

}
