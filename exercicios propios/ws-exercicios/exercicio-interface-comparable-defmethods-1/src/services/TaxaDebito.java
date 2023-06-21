package services;

public class TaxaDebito implements Taxa {

	private double taxa;

	public TaxaDebito(double taxa) {
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}
