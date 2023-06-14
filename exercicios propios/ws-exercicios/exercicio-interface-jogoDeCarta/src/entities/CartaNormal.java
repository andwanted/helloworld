package entities;

public class CartaNormal extends Carta implements Jogavel {


	public CartaNormal(String nome, String descricao) {
		super(nome,descricao);
	
	}

	@Override
	public void jogar() {
		// TODO Auto-generated method stub
		System.out.println(" Carta normal foi jogada!! ");
	}

}
