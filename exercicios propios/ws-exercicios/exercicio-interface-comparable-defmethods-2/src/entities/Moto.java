package entities;

public class Moto extends Veiculo {

	public Moto(String modelo, String marca, String placa, int anoFabricacao, double potencia) {
		super(modelo, marca, placa, anoFabricacao, potencia);

	}

	@Override
	public String toString() {
		return modelo + " " + marca + " " + placa + " " + anoFabricacao + " " + potencia;

	}
}
