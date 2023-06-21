package entities;

public class Produtos implements Comparable<Produtos> {

	private String nomeProduto;
	private Double valorProduto;
	private Integer quantidadeProduto;

	public Produtos(String nomeProduto, Double valorProduto, Integer produto) {
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
	public int compareTo(Produtos other) {
		return this.valorProduto.compareTo(other.valorProduto);
	
	}

	@Override
	public String toString() {
		return getNomeProduto() + "\t" + getValorProduto() + "\t" + getQuantidadeProduto();
	}

}
