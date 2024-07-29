package aula1.collections;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio4 {
	
	public static void main(String[] args) {//Não terminei.
		Map<Character, Integer> mapa = new HashMap<>();
		
		String frase = JOptionPane.showInputDialog("Digite uma frase");
		
		int espacos = 0;
		int letras = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z' || frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z')
			mapa.put(frase.charAt(i), letras);
		}
		System.out.println(mapa);

	}
	

}
