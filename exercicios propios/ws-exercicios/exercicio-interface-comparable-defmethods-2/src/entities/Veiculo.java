package entities;

public abstract class Veiculo {

	protected String modelo;
	protected String marca;
	protected String placa;
	protected int anoFabricacao;
	protected double potencia;

	public Veiculo(String modelo, String marca, String placa, int anoFabricacao, double potencia) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.potencia = potencia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

}
