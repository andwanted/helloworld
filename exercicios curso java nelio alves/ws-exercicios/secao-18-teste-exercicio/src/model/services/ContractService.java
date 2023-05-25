package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinepaymentservice;

	public ContractService(OnlinePaymentService onlinepaymentservice) {
		this.onlinepaymentservice = onlinepaymentservice;
	}

	public void processContract(Contract contract, int months) {
		
		contract.getInstallments().add(new Installment(LocalDate.of(2022,5,10),500.00));
		contract.getInstallments().add(new Installment(LocalDate.of(2022,3,7),120.00));
		
	}

}
