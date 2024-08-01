package aula4.lambda;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList();
		for (int i = 0; i < 5; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno.").toUpperCase();
			alunos.add(nome);
			int fimNome = nome.length();
			alunos.removeIf(n -> nome.charAt(0) == 'T' && nome.charAt(fimNome - 1) == 'O');
		}
		alunos.forEach(System.out::println);
	}
}
