package entities;

import java.util.Scanner;

public class CD extends Midia {
	private Integer faixas;

	public CD() {

	}

	public CD(int codigo, double preco, String nome, int faixas) {

		super(codigo, preco, nome);
		setFaixas(faixas);
	}

	

	public Integer getFaixas() {
		return faixas;
	}

	public void setFaixas(Integer faixas) {
		this.faixas = faixas;
	}

	public String getDetalhes() {
		return super.getDetalhes() + "\n" + "Numero de musicas: " + faixas + "\n";
	}

	public void setMusica(int nfaixas) {
		faixas = (nfaixas > 0) ? nfaixas : 0;
	}

	public void InserirDados() {
		super.inserirDados();
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int faixas = sc.nextInt();
		sc.close();
		setMusica(faixas);
	}

	public String getTipo() {
		return "CD: ";
	}

	public void printDados() {
		String s = getTipo() + "\n" + getDetalhes() + "\n";
		System.out.println(s);
	}

	public String toString() {
		return super.getCodigo() + " " + super.getPreco() + " " + super.getNome() + " " + faixas;
	}

}
