package aula1.collections;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		Map<String, Double> primeiraNota = new HashMap<>();
		Map<String, Double> segundaNota = new HashMap<>();
		Map<String, Double> terceiraNota = new HashMap<>();
		Map<String, Double> mediaNota = new HashMap<>();
		int cont = 1;
		do {
			String nome = JOptionPane.showInputDialog("Nome do Aluno");
			double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
			double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
			double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3"));
			double media = (nota1 + nota2 + nota3)/3;
			primeiraNota.put(nome, nota1);
			segundaNota.put(nome, nota2);
			terceiraNota.put(nome, nota3);
			mediaNota.put(nome, media);
			JOptionPane.showMessageDialog(null,nome + " | " + primeiraNota.get(nome) + " | "  + segundaNota.get(nome)
			+ " | "  + terceiraNota.get(nome) + " | "  + mediaNota.get(nome));
		
		}while(cont != 5);

	}

}
