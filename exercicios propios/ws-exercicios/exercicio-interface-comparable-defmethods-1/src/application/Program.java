package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import entities.Produtos;
import services.Taxa;
import services.TaxaCredito;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Produtos> listaProdutos = new ArrayList<>();

		listaProdutos.add(new Produtos("Biscoito", 5.0, 3));
		listaProdutos.add(new Produtos("Leite", 6.0, 8));
		listaProdutos.add(new Produtos("Café", 15.0, 3));
		listaProdutos.add(new Produtos("Arroz", 12.0, 2));
		listaProdutos.add(new Produtos("Feijao", 10.0, 1));

		Taxa t1 = new TaxaCredito(0.05);

		double totalVenda = 0.0;

		for (Produtos listaProd : listaProdutos) {
			System.out.println("Adicionando.. " + listaProd.getNomeProduto() + " ao carrinho!");
			totalVenda += listaProd.getQuantidadeProduto() * listaProd.getValorProduto();
		}

		// classifica de forma crescente através do primeiro atributo indicado no método
		// compareTo
		Collections.sort(listaProdutos);
		// classifica de forma decrescente através do primeiro atributo indicado no
		// método compareTo
		Collections.sort(listaProdutos, Collections.reverseOrder());

		// classifica de forma crescente através do atributo valor
		Collections.sort(listaProdutos, (p1, p2) -> Double.compare(p1.getValorProduto(), p2.getValorProduto()));

		// classifica de forma decrescente através do atributo valor
		Collections.sort(listaProdutos, (p2, p1) -> Double.compare(p1.getValorProduto(), p2.getValorProduto()));

		// classifica de forma crescente através do atributo quantidade
		Collections.sort(listaProdutos,
				(p1, p2) -> Integer.compare(p1.getQuantidadeProduto(), p2.getQuantidadeProduto()));

		// classifica de forma decrescente através do atributo quantidade
		Collections.sort(listaProdutos,
				(p2, p1) -> Integer.compare(p1.getQuantidadeProduto(), p2.getQuantidadeProduto()));

		System.out.println("\n-------- Nota fiscal -------");
		System.out.println("Produto  Valor  Quantidade");
		for (Produtos listaProd : listaProdutos) {
			System.out.println(listaProd);
		}
		System.out.println("Total compra: " + String.format("%.2f", t1.processarTaxa(totalVenda)));

	}
}
