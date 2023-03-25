package entities;

import java.util.Scanner;

public class DVD extends Midia {

	private Integer faixas;

	public DVD() {

	}

	public DVD(int codigo, double preco, String nome, int faixas) {
		super(codigo, preco, nome);
		setFaixas(faixas);
	}

	public Integer getFaixas() {
		return faixas;
	}

	public void setFaixas(Integer faixas) {
		this.faixas = faixas;
	}

	public String getTipo() {
		return "DVD: ";
	}

	public String getDatalhes() {
		return super.getDetalhes() + "\n" + "Numero de faixas: " + faixas;
	}
	
	public void setFaixas(int nfaixas) {
		faixas = (nfaixas> 0) ? nfaixas:0;
	}
	
	public void InserirDados() {
		super.inserirDados();
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int faixas = sc.nextInt();
		sc.close();
		setFaixas(faixas);
	}

}
