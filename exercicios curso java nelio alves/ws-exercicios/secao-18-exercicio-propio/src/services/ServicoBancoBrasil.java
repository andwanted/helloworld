package services;

public class ServicoBancoBrasil implements ServicoFinanciamento {

	@Override
	public double AvaliarVeiculo(int ano, double valorVeiculo) {
		double taxaCarro = 0.0;
		if (ano < 2010) {
			taxaCarro = 1000.00;
		} else if (ano <= 2015 && ano == 2019) {
			taxaCarro = 500.00;
		} else if (ano >= 2020) {
			taxaCarro = 100.00;
		}

		return taxaCarro;
	}

	@Override
	public boolean AvaliarComprador(int registro, double salario, double fgts) {
		boolean aprovado = false;
		if (registro >= 1 && salario >= 2000.00 && fgts >= 1000) {
			aprovado = true;
		}
		return aprovado;
	}

}
