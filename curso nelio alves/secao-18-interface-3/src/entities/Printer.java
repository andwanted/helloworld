package entities;

public class Printer extends Device {

	public Printer(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Processando documento.. " + doc);

	}

	public void print(String doc) {
		System.out.println("Imprimindo: " + doc);
	}

}
