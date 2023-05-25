package services;

public interface ServicoFinanciamento {

	double AvaliarVeiculo(int ano, double valorVeiculo);
	boolean AvaliarComprador(int registro,double salario,double fgts);
	
}
