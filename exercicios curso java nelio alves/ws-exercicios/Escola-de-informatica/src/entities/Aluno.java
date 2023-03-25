package entities;

public class Aluno {

	private String nome;
	private int idade;
	private long cpf;

	public Aluno() {

	}

	public Aluno(String nome, int idade, long cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		return "Aluno:\n" + "Nome:" + getNome() + "\nIdade: " + getIdade() + "\nCpf: " + getCpf();
	}

}
