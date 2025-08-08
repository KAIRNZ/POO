package conta;


public class ContaBancaria {
private String numeroConta;
private double saldo = 0;


public void conta(String numeroConta) {
	this.numeroConta = numeroConta;
}
public void depositar(double depositar){
	saldo += depositar;
}
public void sacar(double sacar) {
	
	if(sacar <= saldo) {
		saldo -= sacar;
	}
	else {
		System.out.println("saldo insuficiente, seu saldo é: "+saldo);
	}

}
public void visualizar() {
	System.out.println("seu saldo é "+saldo);
}
}
