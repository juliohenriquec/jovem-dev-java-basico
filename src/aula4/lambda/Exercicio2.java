package aula4.lambda;

import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		ArrayList<Aluno> alunos = new ArrayList();
		for (int i = 0; 0 < 5; i++) {
			int numeroChamada = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro."));
			int dataNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro."));
			alunos.add(new Aluno(numeroChamada, dataNascimento));
		}

	}
}
