package orientacaoobjeto;

public class Produto {
	public String nome;
	public int quantidade;
	public double valor;

	public Produto(String nome, int quantidade, double valor) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public void venderProduto(int quantidade) {
		if (this.quantidade < quantidade) {
			System.out.println("Estoque insuficiente!");
		} else {
			this.quantidade -= quantidade;
			System.out.println("Nova quantidade: "+ this.quantidade);
		}
	}

	public void reporEstoque(int quantidade) {
		this.quantidade += quantidade;
		System.out.println("Nova quantidade: " + this.quantidade);
	}
}
