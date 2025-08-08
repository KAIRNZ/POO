package exerciciocarros;

import java.util.Scanner;

public class carros {

	private String marca;

	private String modelo;

	private int ano;

	Scanner sc = new Scanner(System.in);

	public carros(String marca, String modelo, int ano) {

		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}
	public void exibir() {
		System.out.println("seu carro é do modelo "+modelo);
		System.out.println("da marca "+ marca);
		System.out.println("e do ano "+ ano);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
