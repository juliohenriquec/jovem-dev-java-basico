package aula3.tratamentoerros;

import java.util.ArrayList;

public class Venda {
	private String nomeCliente;
	private ArrayList<Item> itens;

	public Venda(String nomeCliente) {
		nomeCliente = nomeCliente;
		itens = new ArrayList<>();
	}

	public void adicionarItem(Item item) {
		itens.add(item);
	}

}
