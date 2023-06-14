package entities;

public class CartaMagica extends Carta implements Jogavel {

	public CartaMagica(String nome, String descricao) {
		super(nome, descricao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jogar() {
		// TODO Auto-generated method stub
		System.out.println(" Carta Magica foi jogada!! ");

	}

}