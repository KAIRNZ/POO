package conta;

public class Main {

	public static void main(String[] args) {
		ContaBancaria bc = new ContaBancaria();

		bc.conta("2345234534");
		bc.depositar(10000);
		bc.visualizar();
		bc.sacar(100);
		bc.visualizar();
	}

}
