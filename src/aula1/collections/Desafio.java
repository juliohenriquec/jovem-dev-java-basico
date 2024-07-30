package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class Desafio {
	public static void main(String[] args) {
		Map<Character, ArrayList<String>> vogais = new HashMap<>();
		String palavra = "";

		for (char vogal : new char[] { 'a', 'e', 'i', 'o', 'u' }) {
			vogais.put(vogal, new ArrayList<>());
		}

		do {
			palavra = JOptionPane.showInputDialog("Digite uma palavra (digite fim para finalizar)").toLowerCase();
			if (palavra.equals("fim")) {
				break;
			}

			for (char vogal : palavra.toCharArray()) {
				if (vogais.containsKey(vogal)) {
					vogais.get(vogal).add(palavra);
				}
			}
		} while (true);

		for (char vogal : "aeiou".toCharArray()) {
			List<String> palavras = vogais.get(vogal);
			Collections.sort(palavras);
			JOptionPane.showMessageDialog(null, "Vogal '" + vogal + "': " + palavras);
		}
	}
}
