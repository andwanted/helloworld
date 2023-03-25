package entities;

import java.util.Scanner;

public class Midia {
	private Integer codigo;
	private Double preco;
	private String nome;

	public Midia() {

	}

	public Midia(int codigo, double preco, String nome) {
		setCodigo(codigo);
		setPreco(preco);
		setNome(nome);
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return "Midia: ";
	}

	public String getDetalhes() {
		return "Codigo: " + getCodigo() + "\n" + "Preço: " + getPreco() + "\n" + "Nome: " + getNome() + "\n";
	}

	public void printDados() {
		String s = getTipo() +"\n" + getDetalhes() + "\n";
		System.out.println(s);
	}

	public void inserirDados() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n Entre com o codigo: ");
		int codigo = sc.nextInt();
		System.out.println("\n Entre com o preço: ");
		double preco = sc.nextDouble();
		sc.nextLine();
		System.out.println("\n Entre com o nome: ");
		String nome = sc.next();
		
		sc.close();
		
		setCodigo(codigo);
		setPreco(preco);
		setNome(nome);
	}

}
