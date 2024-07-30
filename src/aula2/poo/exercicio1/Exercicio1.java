package aula2.poo.exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		JOptionPane.showMessageDialog(null, "Representação inteira: " + (int) numero);
	}

}
