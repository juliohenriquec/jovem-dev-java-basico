package aula1.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		Map<String, double[]> alunos = new HashMap<>();

		for (int i = 0; i < 5; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
			double[] notas = new double[3];
			for (int j = 0; j < 3; j++) {
				notas[j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota" + (j + 1) + " de " + nome));
			}
			alunos.put(nome, notas);
		}
		for (Entry<String, double[]> entry : alunos.entrySet()) {
			String nome = entry.getKey();
			double[] notas = entry.getValue();
			double soma = 0;
			for(double nota : notas) {
				soma += nota;
			}
			double media = soma / notas.length;
			String msg = "Nome: "  + nome + "\nNotas: ";
			for(double nota : notas) {
				msg += nota + " | ";
			}
			JOptionPane.showMessageDialog(null, msg + "\nMédia: " + String.format("%.2f", media));
		}
	}
}
