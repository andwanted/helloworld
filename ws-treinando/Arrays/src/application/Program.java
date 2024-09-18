package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]Titulos = {2000,2012};
		
		System.out.println("Titulo 1: " + Titulos[0]);
		System.out.println("Titulo 2: " + Titulos[1]);
		
		for(int i=0;i< Titulos.length;i++) {
			System.out.println("Titulo do ano: " + Titulos[i]);
		}
		
		for(int titulo:Titulos) {
			System.out.println(titulo);
		}

	}

}
