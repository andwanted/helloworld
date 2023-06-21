package services;

public interface Taxa {

	double getTaxa();

	default double processarTaxa(double valorTotal) {
		return valorTotal += valorTotal * getTaxa();
	}

}
