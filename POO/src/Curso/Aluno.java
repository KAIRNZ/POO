package Curso;

public class Aluno {

	private String nomeAluno;
	private double matricula;
	
	public Aluno(String nomeAluno, double matricula) {
		this.nomeAluno = nomeAluno;
		this.matricula = matricula;
	}
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public double getMatricula() {
		return matricula;
	}
	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}
	
	
}
