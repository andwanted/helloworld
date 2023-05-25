package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data ((dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), dtf);
		System.out.print("Valor do contrato: ");
		double valueContract = sc.nextDouble();

		Contract obj = new Contract(number, date, valueContract);

		System.out.println("Entre com o numero de parcelas: ");
		int m = sc.nextInt();

		ContractService service = new ContractService(new PaypalService());

		service.processContract(obj, m);
		
		System.out.println("Parcelas: ");
		for (Installment installments : obj.getInstallments()) {
			System.out.println(installments);
		}

		sc.close();
	}

}
