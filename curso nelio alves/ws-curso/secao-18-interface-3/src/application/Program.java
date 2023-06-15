package application;

import entities.ConcretScanner;
import entities.ComboDevice;
import entities.ConcretPrinter;

public class Program {

	public static void main(String[] args) {

		ConcretPrinter p = new ConcretPrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		System.out.println("#########################");
		ConcretScanner s = new ConcretScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		System.out.println("#########################");
		ComboDevice c = new ComboDevice("SERIECOMBO1312331");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Resultado do scan Combo .." + c.scan());
	}

}
