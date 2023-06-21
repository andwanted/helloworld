package entities;

public class Carro extends Veiculo implements Comparable<Carro> {

	private int portas;

	public Carro(int portas, String modelo, String marca, String placa, int anoFabricacao, double potencia) {
		super(modelo, marca, placa, anoFabricacao, potencia);
		this.portas = portas;
	}

	@Override
	public String toString() {
		return portas + " portas" + " " + modelo + " " + marca + " " + placa + " " + anoFabricacao + " " + potencia;

	}

	@Override
	public int compareTo(Carro o) {
		// TODO Auto-generated method stub
		return modelo.compareTo(o.modelo);
	}

}
