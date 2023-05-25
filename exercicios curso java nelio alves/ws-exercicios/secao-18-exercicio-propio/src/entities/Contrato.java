package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
	private Integer numero;
	private LocalDate data;
	private Double valorTotal;

	private Comprador comprador;
	private Veiculo veiculo;

	private List<Parcelas> parcelas = new ArrayList<>();

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Contrato(Integer numero, LocalDate data, Double valorTotal, Comprador comprador, Veiculo veiculo) {

		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
		this.comprador = comprador;
		this.veiculo = veiculo;

	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public List<Parcelas> getParcelas() {
		return parcelas;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Numero contrato: " + numero + "\n");
		sb.append("Data firmada: " + data.format(dtf) + "\n");
		sb.append(comprador + "\n");
		sb.append(veiculo + "\n");
		sb.append("Valor total " + String.format("%.2f", valorTotal) + "\n");
		for (int i = 0; i < parcelas.size(); i++) {
			sb.append(("\n" + parcelas.get(i)));
		}

		return sb.toString();
	}

}
