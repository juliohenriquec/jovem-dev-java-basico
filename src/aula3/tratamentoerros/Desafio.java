package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;
import aula3.tratamentoerros.exceptions.VendaException;

public class Desafio {
	public static void main(String[] args) {
		String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente");
		int qtItens = 0;
		try {
			qtItens = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de intens comprados."));
			if (qtItens > 10) {
				throw new VendaException("Você só pode colocar no máximo 10 itens!");
			} else if (qtItens < 1) {
				throw new VendaException("Você tem que colocar no mínimo 1 item!");
			}
			Venda venda = new Venda(nomeCliente);

			for (int i = 0; i < qtItens; i++) {
				String nomeItem = JOptionPane.showInputDialog("Digite o nome do item " + (i + 1));
				
				while(true) {
					try {
					Double precoItem = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do item " + (i + 1)));
					if (precoItem <= 0.0) {
						throw new PrecoIncorretoException("Preço incorreto. Deve ser maior que zero.");
					}
					break;
					}catch (PrecoIncorretoException e) {
						e.printStackTrace();
					}
				}
				
				Item item = new Item();
				venda.adicionarItem(item);
			}
			JOptionPane.showMessageDialog(null, "Venda concluída!");
		} catch (VendaException e) {
			e.printStackTrace();
		}

	}
}
