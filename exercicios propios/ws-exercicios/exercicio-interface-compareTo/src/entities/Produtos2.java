package entities;

public class Produtos2 implements Comparable<Produtos2> {

	private String nomeProduto;
	private Double valorProduto;
	private Integer quantidadeProduto;

	public Produtos2(String nomeProduto, Double valorProduto, Integer produto) {
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		this.quantidadeProduto = produto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public Integer getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setProduto(Integer produto) {
		this.quantidadeProduto = produto;
	}

	/*
	 * @Override public int compareTo(Produtos other) { // TODO Auto-generated
	 * method stub return nomeProduto.compareTo(other.nomeProduto); }
	 */

	@Override
	public int compareTo(Produtos2 other) {
		// Ordena por nome em ordem crescente
		int resultadoNome = this.nomeProduto.compareTo(other.getNomeProduto());
		if (resultadoNome != 0) {
			return resultadoNome;
		}
		// Ordena por valor em ordem crescente
		int resultadoValor = Double.compare(this.valorProduto, other.valorProduto);
		if (resultadoValor != 0) {
			return resultadoValor;
		}
		// Ordena por quantidade em ordem crescente
		int resultadoQuantidade = Integer.compare(this.quantidadeProduto, other.quantidadeProduto);
		return resultadoQuantidade;
	}

	@Override
	public String toString() {
		return getNomeProduto() + "\t" + getValorProduto() + "\t" + getQuantidadeProduto();
	}

}
