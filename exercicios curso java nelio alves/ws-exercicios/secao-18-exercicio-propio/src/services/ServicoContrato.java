package services;

import java.time.LocalDate;

import entities.Contrato;
import entities.Parcelas;

public class ServicoContrato {

	private ServicoFinanciamento servicoFinanciamento;

	public ServicoContrato(ServicoFinanciamento servicoFinanciamento) {
		this.servicoFinanciamento = servicoFinanciamento;
	}

	public void ProcessarContrato(Contrato contrato, int meses, int ano, double valorVeiculo, int registro,
			double salario, double fgts) {

		double taxa = servicoFinanciamento.AvaliarVeiculo(ano, valorVeiculo);
		double valorParcial = contrato.getValorTotal() / meses;

		for (int i = 1; i <= meses; i++) {
			LocalDate dataVencimento = contrato.getData().plusMonths(i);
			double acrescimoMes = valorParcial * i / 100;
			double valorParcela = valorParcial + taxa + acrescimoMes;
			contrato.getParcelas().add(new Parcelas(valorParcela, taxa, acrescimoMes, dataVencimento));
		}

	}

}
