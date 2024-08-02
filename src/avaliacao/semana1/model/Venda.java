package avaliacao.semana1.model;

import java.util.ArrayList;

public class Venda {
	private Cliente cliente = new Cliente(null, null);
	private static ArrayList<ItemVenda> itens;

	public Venda() {
		String nomeCliente = Cliente.getNome();
		itens = new ArrayList<>();
	}

	public static void adicionarItem(ItemVenda item) {
		itens.add(item);
	}

}
