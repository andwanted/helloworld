package entities;

//https://www.ic.unicamp.br/~santanch/teaching/oop/2019-1/slides/poo0401-relacionamento-v03.pdf

public class Zumbi {

	private String nome;

	public Zumbi() {

	}

	public Zumbi(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
