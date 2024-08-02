package avaliacao.semana1.model;

import java.util.function.Consumer;

import avaliacao.semana1.Principal;

public class Produto {
	private static String nomeProduto;
	private static Double preco;

	public static void main(String[] args) {
		new Produto(nomeProduto, preco);
	}

	public Produto(String nomeProduto, Double preco) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
	}

	public static String getNomeProduto() {
		return nomeProduto;
	}

	public static Double getPreoco() {
		return preco;
	}
}
