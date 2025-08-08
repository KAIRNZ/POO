package Curso;

public class Curso {

	private String nomeCurso;
	private Aluno[] alunos = new Aluno[3];

	public Curso(String nomeCurso, Aluno[] alunos) {
		this.nomeCurso = nomeCurso;
		this.alunos = alunos;
	}

	public void adcAluno(Aluno aluno) {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] == null) {
				alunos[i] = aluno;
				break;
			}
		}
	}

	public void lista() {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				System.out.println("Nome: "+ alunos[i].getNomeAluno()+", e sua matrícula é: "+alunos[i].getMatricula());
			}
		}
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

}