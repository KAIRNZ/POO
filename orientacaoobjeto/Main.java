package orientacaoobjeto;

import java.util.Scanner;

public class Main {
	public static Produto[] produtos = new Produto[10];
	public static double valorTotalVendas = 0;

	public static void main(String[] args) {
		menu();
	}

	public static void cadastrarProduto() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do produto:");
		String nome = sc.next();

		System.out.print("Digite a quantidade do produto:");
		int quantidade = sc.nextInt();

		System.out.print("Digite o valor do produto:");
		double valor = sc.nextDouble();
		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] == null) {
				produtos[i] = new Produto(nome, quantidade, valor);
				break;
			} else {
				System.out.print("Não é possível cadastrar o produto.");
			}
		}
	}

	public static void visualizadorProdutos() {
		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] != null) {
				System.out.println("Nome: " + produtos[i].nome + ", quantidade: " + produtos[i].quantidade
						+ ", e o valor é: " + produtos[i].valor);
			}
		}

	}

	public static void venderMain() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual produto quer vender?");
		String nome = sc.next();
		System.out.println("Qual Quantidade quer vender?");
		int quantidade = sc.nextInt();

		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] != null) {
				if(produtos[i].nome.equals(nome)) {
					if(produtos[i].quantidade >= quantidade) {
						produtos[i].retirarProduto(quantidade);
						valorTotalVendas = valorTotalVendas + produtos[i].valor * quantidade;
						break;
					}else {
						System.out.println("quantidade invalida!");
					}
				}
			}else{
				System.out.println("Produto não encontrado.");
				break;
		}}
}

	public static void reporEstoque() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual produto quer repor?");
		String nome = sc.next();
		System.out.println("Qual Quantidade quer repor/adicionar?");
		int quantidade = sc.nextInt();

		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] != null && produtos[i].equals(nome)) {
				produtos[i].adicionarProduto(quantidade);
				System.out.println("Você agora tem:" + produtos[i].quantidade + " de " + produtos[i].nome);
			}

		}

	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int op;

		while (true) {

			System.out.println("[1] - para cadastrar produto");
			System.out.println("[2] - para vender produto");
			System.out.println("[3] - para visualizar financeiro");
			System.out.println("[4] - repor estoque");
			System.out.println("[5] - visualizar estoque");
			System.out.println("[0] - Sair");

			op = sc.nextInt();

			switch (op) {
			case 1:
				cadastrarProduto();
				break;
			case 2:
				venderMain();
				break;
			case 3:
				System.out.println("o valor total de vendas é: " + valorTotalVendas);
				break;
			case 4:
				reporEstoque();
				break;
			case 5:
				visualizadorProdutos();
				break;
			case 0:
				return;
			default:
				System.out.println("operação invalida!");
				break;
			}
		}

	}
}
