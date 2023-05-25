package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {
	private double valorParcela;
	private double taxaBancaria;
	private double taxaMensal;
	private LocalDate vencimento;

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Parcelas(double valorParcela, double taxaBancaria, double taxaMensal, LocalDate vencimento) {
		this.valorParcela = valorParcela;
		this.taxaBancaria = taxaBancaria;
		this.taxaMensal = taxaMensal;
		this.vencimento = vencimento;
	}

	public double getTaxaBancaria() {
		return taxaBancaria;
	}

	public void setTaxaBancaria(double taxaBancaria) {
		this.taxaBancaria = taxaBancaria;
	}

	public double getTaxaMensal() {
		return taxaMensal;
	}

	public void setTaxaMensal(double taxaMensal) {
		this.taxaMensal = taxaMensal;
	}

	public double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	@Override
	public String toString() {
		return "Valor da parcela: " + String.format("%.2f", valorParcela) + " Taxa bancaria: " + String.format("%.2f", taxaBancaria) + " Taxa mensal: " + String.format("%.2f", taxaMensal) + " - " + vencimento.format(dtf);
	}

}
