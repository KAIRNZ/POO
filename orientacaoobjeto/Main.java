package orientacaoobjeto;

import java.util.Scanner;

public class Main {
	public static Produto[] produtos = new Produto[10];
	
	public static void main(String[] args) {
		cadastrarProduto();
		System.out.println(produtos[0].nome);
	}

	public static void cadastrarProduto() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do produto:");
		String nome = sc.next();
		
		System.out.print("Digite a quantidade do produto:");
		int quantidade = sc.nextInt();
		
		System.out.print("digite o valor do produto:");
		double valor = sc.nextDouble();
		for(int i =0; i<produtos.length; i++) {
			if(produtos[i] == null) {
				produtos[i] = new Produto(nome, quantidade, valor);
			}
			else {
				System.out.print("Não é possível cadastrar o produto.");
			}
		}
		sc.close();
	}
}
