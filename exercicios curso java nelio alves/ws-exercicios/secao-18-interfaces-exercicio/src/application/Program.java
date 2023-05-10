package application;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contratos;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		int numeroContrato = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate dataContrato = LocalDate.parse(sc.next(),dtf);
		System.out.print("Valor do contrato: ");
		double valorContrato = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		int quantidadeParcelas = sc.nextInt();
		
		
		
		System.out.println("Parcelas");
		
		

	}

}
