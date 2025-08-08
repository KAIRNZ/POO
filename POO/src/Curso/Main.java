package Curso;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Anthony", 02231);
		Aluno a2 = new Aluno("Irmoson", 03312);
		Aluno a3 = new Aluno("Bebel", 04412);

		Aluno[] alunos = new Aluno[3]; 
		
		Curso c = new Curso("ADS", alunos);
		
		System.out.println("Lista de alunos turma " + c.getNomeCurso()+"\n");
		
		c.adcAluno(a1);
		c.adcAluno(a2);
		c.adcAluno(a3);
		
		c.lista();
	}

}
