package entities;

public class CartaEspecial extends Carta implements Jogavel {

	public CartaEspecial(String nome, String descricao) {
		super(nome, descricao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jogar() {
		// TODO Auto-generated method stub
		System.out.println(" Carta especial foi jogada!! ");

	}

}
