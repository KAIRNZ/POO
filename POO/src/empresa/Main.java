package empresa;

public class Main {

	public static void main(String[] args) {
		Gerente g = new Gerente("Pedro", 150);
		Funcionario f = new Funcionario("jose", 150);
		
		System.out.print("O bonus do gerente "+ g.getNome()+" é ");g.receberbonus();
		System.out.print("O bonus do funcionario "+ f.getNome()+" é ");f.receberbonus();
		
		
		

	}
	
}
