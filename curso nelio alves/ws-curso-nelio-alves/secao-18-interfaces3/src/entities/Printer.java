package entities;

public class Printer extends Device {

	public void processDoc(String doc) {

		System.out.println("Print process " + doc);

	}
	
	public void print(String doc) {
		System.out.println("Printing " + doc);
	}

}
