package entities;


import java.time.format.DateTimeFormatter;

public class Comprador {
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy");

	private String nome;
	private int registro;
	private Double salario;
	private Double fgts;

	public Comprador(String nome, int registro, Double salario, Double fgts) {
		this.nome = nome;
		this.registro = registro;
		this.salario = salario;
		this.fgts = fgts;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getFgts() {
		return fgts;
	}

	public void setFgts(Double fgts) {
		this.fgts = fgts;
	}

	@Override
	public String toString() {
		return "Nome comprado: "+ nome + " Tempo de registro: " + registro + " Salario: " + String.format("%.2f", salario) + " FGTS: " + String.format("%.2f", fgts);
	}

}
