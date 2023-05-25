package entities;

import java.time.format.DateTimeFormatter;

public class Veiculo {

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy");

	private String modelo;
	private String marca;
	private Double valor;
	private int ano;

	public Veiculo(String modelo, String marca, Double valor, int ano) {
		this.modelo = modelo;
		this.marca = marca;
		this.valor = valor;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Veiculo: " + modelo + " Modelo: " + marca + " Valor: " + String.format("%.2f", valor) + " Ano: " + ano;

	}

}
