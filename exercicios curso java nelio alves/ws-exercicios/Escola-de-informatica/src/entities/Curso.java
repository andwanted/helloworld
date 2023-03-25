package entities;

public class Curso {

	private String nome;
	private Integer codigo;

	public Curso() {

	}

	public Curso(String nome, Integer codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void cadastrarCurso(String nome, int codigo) {
		setNome(nome);
		setCodigo(codigo);
		System.out.print("Curso cadastrado: \n" + toString());
	}

	public String toString() {
		return "Curso: " + getNome() + "\nCodigo: " + getCodigo();
	}

}
