package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
import entities.Curso;
import entities.Professor;
import entities.Turma;
import entities.enums.Turno;

public class Program {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Cadastrar curso");
		System.out.print("Digite o nome do curso: ");
		String nomeCurso = sc.nextLine();
		System.out.print("Digite o codigo do curso: ");
		int codCurso = sc.nextInt();
		Curso curso = new Curso(nomeCurso, codCurso);
		System.out.println("Curso cadastrado: ");
		System.out.print(curso.toString());
		System.out.println("\n--------------------------");

		System.out.println("Abrir turma ");
		sc.nextLine();
		System.out.print("Nome da turma: ");
		String nomeTurma = sc.nextLine();
		System.out.print("Codigo da turma: ");
		int codTurma = sc.nextInt();
		System.out.print("Turno: ");
		Turno turno = Turno.valueOf(sc.next());
		Turma turma = new Turma(nomeTurma, codTurma, turno, curso);
		System.out.println("\n--------------------------");
		System.out.println("Turma aberta");
		System.out.print(turma.toString());
		System.out.println("\n--------------------------");

		System.out.println("Cadastrar professor: ");
		System.out.print("Quantos professores serão cadastrados?");
		int nProf = sc.nextInt();
		for (int i = 1; i <= nProf; i++) {
			System.out.print("Nome do professor: ");
			String nomeProf = sc.next();
			System.out.print("Registro do professor: ");
			int regProf = sc.nextInt();
			Professor professor = new Professor(nomeProf, regProf);
			turma.addProfessor(professor);
		}

		System.out.println("\n--------------------------");
		System.out.println("Cadastrar alunos: ");
		System.out.print("Quantos alunos serão cadastrados?");
		int nAlunos = sc.nextInt();
		for (int i = 1; i <= nAlunos; i++) {
			System.out.print("Nome do aluno: ");
			String nomeAluno = sc.next();
			System.out.print("Idade do aluno: ");
			int idadeAluno = sc.nextInt();
			System.out.print("Cpf do aluno: ");
			long cpfAluno = sc.nextLong();
			Aluno aluno = new Aluno(nomeAluno, idadeAluno, cpfAluno);
			turma.addAluno(aluno);
		}

		System.out.println("\n--------------------------");
		System.out.println("Quantos professores serão cadastrados na turma?");
		int contarProfReg = sc.nextInt();
		sc.nextLine();
		int i = 0;

		while (i < contarProfReg) {
			boolean encontrado = false;
			System.out.print("Nome procurado");
			String professorProcurado = sc.next();
			for (Professor p : turma.getProfessores()) {
				if (p.getNome().equals(professorProcurado)) {
					Professor pCadastro = new Professor(p.getNome(), p.getregistro());
					turma.addProfessoresCadastrados(pCadastro);
					System.out.println(
							"Professor: " + turma.getProfessoresCadastrados().get(i).getNome() + " cadastrado");
					i++;
					encontrado = true;
					break;
				}
			}
			if (encontrado == false) {
				System.out.println("Não encontrado, digite novamente!");
			}
		}

		System.out.println("Quantos alunos serão matriculados? ");
		int contarAlunoMat = sc.nextInt();
		i = 0;

		while (i < contarAlunoMat) {
			boolean encontrado = false;
			System.out.print("Digite o nome do aluno: ");
			String nomeAlunoMatricula = sc.next();
			for (Aluno a : turma.getAlunos()) {
				if (a.getNome().equals(nomeAlunoMatricula)) {
					Aluno aMatricula = new Aluno(a.getNome(), a.getIdade(), a.getCpf());
					turma.addAlunosCadastrados(aMatricula);
					System.out.println("Aluno: " + turma.getAlunosCadastrados().get(i).getNome() + " matriculado");
					i++;
					encontrado = true;
					break;
				}
			}
			if (encontrado == false) {
				System.out.println("Não encontrado, digite novamente!");
			}
		}

		System.out.println(turma.toString());

		sc.close();

	}

}
