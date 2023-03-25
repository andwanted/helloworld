package entities;

public class Professor {

	private String nome;
	private int registro;

	public Professor() {

	}

	public Professor(String nome, int registro) {
		this.nome = nome;
		this.registro = registro;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getregistro() {
		return registro;
	}

	public void setregistro(int registro) {
		this.registro = registro;
	}

	public String toString() {
		return "Professor:" + "\nNome: " + getNome() + "\nRegistro do professor " + getregistro();
	}

}
