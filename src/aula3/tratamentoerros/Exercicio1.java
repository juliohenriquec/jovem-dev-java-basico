package aula3.tratamentoerros;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		boolean stop = true;
		while (stop) {
			try {
				int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
				JOptionPane.showMessageDialog(null, numero);
				stop = false;

			} catch (NumberFormatException | NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Você digitou um valor não reconhecido.");
			}
		}
	}
}
