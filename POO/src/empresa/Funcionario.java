package empresa;

import java.util.Scanner;

public class Funcionario {
	public String nome;
	public double salario;
	Scanner sc = new Scanner(System.in);

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void receberbonus() {
		this.salario = salario * 0.1;
		System.out.println(salario);
	}

}
