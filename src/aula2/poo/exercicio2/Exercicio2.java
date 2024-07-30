package aula2.poo.exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		String frase1 = JOptionPane.showInputDialog("Digite uma frase");
		String frase2 = JOptionPane.showInputDialog("Digite outra frase");

		if (frase1.contentEquals(frase2)) {
			int tamanho = frase1.length();
			JOptionPane.showMessageDialog(null, "As frases são iguais e possuiem " + tamanho + " caracteres");
		} else {
			JOptionPane.showMessageDialog(null, "As frases *não* são iguais");
			int tamanho = frase1.length();
			JOptionPane.showMessageDialog(null, "A  primeria frase possui " + tamanho + " caracteres");
			tamanho = frase2.length();
			JOptionPane.showMessageDialog(null, "A  segunda frase possui " + tamanho + " caracteres");
		}

	}

}
