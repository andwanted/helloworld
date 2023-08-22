package entities;

import java.util.List;

public class Animal {

	private String especie;
	private String nome;
	private Integer idade;

	List<Animal> Animals;

	public Animal(String especie, String nome, Integer idade) {
		this.especie = especie;
		this.nome = nome;
		this.idade = idade;

	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public List<Animal> getAnimals() {
		return Animals;
	}

	public void addAnimal(Animal animal) {
		Animals.add(animal);
	}

	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", nome=" + nome + ", idade=" + idade + ", Animals=" + Animals + "]";
	}

}
