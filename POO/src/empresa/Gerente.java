package empresa;

public class Gerente extends Funcionario{

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void receberbonus() {
		this.salario = salario * 0.2;
		System.out.println(salario);
	}

}
