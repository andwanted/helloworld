package entities;

public class Scanner extends Device {

	@Override
	public void processDoc(String doc) {
		System.out.println("Scan process " + doc);
	}

	public void scan() {

		System.out.println("Scanning!");

	}

}
