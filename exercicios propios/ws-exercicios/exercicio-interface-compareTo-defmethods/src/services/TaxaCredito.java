package services;

public class TaxaCredito implements Taxa {

	private double taxa;

	public TaxaCredito(double taxa) {
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}
