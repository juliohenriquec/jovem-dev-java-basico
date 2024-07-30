package aula1.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Digite uma frase");

		Map<Character, Integer> contagemCaracteres = new HashMap<>();

		for (char caractere : frase.toCharArray()) {
			if (!contagemCaracteres.containsKey(caractere)) {
				contagemCaracteres.put(caractere, 1);
			} else {
				contagemCaracteres.put(caractere, contagemCaracteres.get(caractere) + 1);
			}
		}
		JOptionPane.showMessageDialog(null, "Quantidade de vezes que cada caractere aparece na frase: \n" + "Espaços "
				+ contagemCaracteres.get(contagemCaracteres) + ": " + contagemCaracteres);
	}
}
