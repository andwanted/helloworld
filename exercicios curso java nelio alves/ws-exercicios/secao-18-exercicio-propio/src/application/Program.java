package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Comprador;
import entities.Contrato;
import entities.Veiculo;
import services.ServicoBancoBrasil;
import services.ServicoBradesco;
import services.ServicoContrato;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do comprador");
		System.out.print("Nome do comprador: ");
		String nome = sc.nextLine();
		System.out.print("Tempo de registro: ");
		int registro = sc.nextInt();
		System.out.print("Salario: ");
		double salario = sc.nextDouble();
		System.out.print("FGTS: ");
		double fgts = sc.nextDouble();

		Comprador comprador = new Comprador(nome, registro, salario, fgts);

		System.out.println("Entre com os dados do veiculo");
		System.out.print("Marca: ");
		String marca = sc.next();
		System.out.print("Modelo: ");
		String modelo = sc.next();
		System.out.print("Valor: ");
		double valor = sc.nextDouble();
		System.out.print("ano: ");
		int anoVeiculo = sc.nextInt();

		Veiculo veiculo = new Veiculo(modelo, marca, valor, anoVeiculo);

		System.out.print("Numero do contrato");
		int numeroContrato = sc.nextInt();

		System.out.print("Numero de parcelas: ");
		int parcelas = sc.nextInt();

		System.out.print("Qual banco será utilizado: (1) Para Banco do Brasil / (2) Para Bradeisco");
		int n = sc.nextInt();

		Contrato contrato = new Contrato(numeroContrato, LocalDate.now(), valor, comprador, veiculo);

		if (n == 1) {
			ServicoContrato sv = new ServicoContrato(new ServicoBancoBrasil());
			sv.ProcessarContrato(contrato, parcelas, anoVeiculo, valor, registro, salario, fgts);
		}else if (n == 2) {
			ServicoContrato sv = new ServicoContrato(new ServicoBradesco());
			sv.ProcessarContrato(contrato, parcelas, anoVeiculo, valor, registro, salario, fgts);
		}


		System.out.println(contrato);

		sc.close();
	}

}
