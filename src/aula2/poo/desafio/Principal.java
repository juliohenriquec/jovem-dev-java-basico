package aula2.poo.desafio;

import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Carro> carros = new ArrayList();
		String modelo;
		int ano;
		int anoFinal = 2024;
		while (true) {
			modelo = JOptionPane.showInputDialog("Digite o modelo do carro. (ou 'fim' para terminar)");

			if (modelo.equalsIgnoreCase("fim")) {
				break;
			}
			ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro."));
			carros.add(new Carro(modelo, ano));

		}

		carros.sort(Comparator.comparingInt(c -> ((Carro) c).getIdade(anoFinal)).reversed());

		String msg = "Carros em ordem decrescente de idade\n";
		for (Carro carro : carros) {
			msg += carro + "\n";
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}
