package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.enums.Turno;

public class Turma {

	private String nome;
	private Integer codigo;
	private Turno turno;
	private Curso curso;
	private List<Turma> turmas = new ArrayList<>();
	private List<Aluno> alunos = new ArrayList<>();
	private List<Professor> professores = new ArrayList<>();
	private List<Aluno> alunosCadastrados = new ArrayList<>();
	private List<Professor> professoresCadastrados = new ArrayList<>();

	public Turma() {

	}

	public Turma(String nome, Integer codigo, Turno turno, Curso curso) {
		this.nome = nome;
		this.codigo = codigo;
		this.turno = turno;
		this.curso = curso;
	}

	public Turma(String nome, Integer codigo, Turno turno, Curso curso, List<Turma> turmas,
			List<Professor> professores) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.turno = turno;
		this.curso = curso;
		this.turmas = turmas;
		this.professores = professores;
	}

	public Turma(String nome, Integer codigo, Turno turno, Curso curso, List<Turma> turmas, List<Aluno> alunos,
			List<Professor> professores) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.turno = turno;
		this.curso = curso;
		this.turmas = turmas;
		this.alunos = alunos;
		this.professores = professores;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
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

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public List<Aluno> getAlunosCadastrados() {
		return alunosCadastrados;
	}

	public List<Professor> getProfessoresCadastrados() {
		return professoresCadastrados;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	public void addAlunosCadastrados(Aluno aluno) {
		alunosCadastrados.add(aluno);
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void addProfessoresCadastrados(Professor professor) {
		professoresCadastrados.add(professor);
	}

	public void addProfessor(Professor professor) {
		professores.add(professor);
	}

	public void listaProfessor() {
		System.out.println("Lista de Professores: ");
		for (Professor p : professores) {
			System.out.println(p.toString());
		}
	}

	public void listaAluno() {
		System.out.println("Lista de alunos: ");
		for (Aluno a : alunos) {
			System.out.println(a.toString());
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("-------------------------------\n");
		sb.append("Informações da turma\n");
		sb.append("Turma " + getNome());
		sb.append("\nCodigo: " + getCodigo());
		sb.append("\nTurno: " + getTurno());
		sb.append("\nCurso: " + getCurso());
		if (professoresCadastrados.size() != 0) {
			sb.append("\nProfessores cadastrados na turma: ");
		}
		for (Professor prof : professoresCadastrados) {
			sb.append(prof.getNome() + " " + prof.getregistro() + "\n");
		}
		if (alunosCadastrados.size() != 0) {
			sb.append("\nAlunos matriculados na turma: ");
		}
		for (Aluno aluno : alunosCadastrados) {
			sb.append(aluno.getNome() + " " + aluno.getCpf() + "\n");
		}
		return sb.toString();
	}

}
