package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		double cotaBasica = contract.getValue() / months;

		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interest = onlinePaymentService.interest(cotaBasica, i);
			double fee = onlinePaymentService.paymentFee(cotaBasica + interest);
			double totalValueInstallment = cotaBasica + interest + fee;

			contract.getInstallments().add(new Installment(dueDate, totalValueInstallment));

		}

	}

}
