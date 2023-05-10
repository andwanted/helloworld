package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contratos {

	private Integer numero;
	private Date data;
	private Double valorTotal;

	private List<Parcelas> parcelas = new ArrayList<>();
	

	public Contratos(Integer numero, Date data, Double valorTotal, List<Parcelas> parcelas) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
		this.parcelas = parcelas;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Parcelas> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<Parcelas> parcelas) {
		this.parcelas = parcelas;
	}
	
	

}
