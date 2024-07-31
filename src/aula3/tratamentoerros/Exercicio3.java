package aula3.tratamentoerros;

import java.util.ArrayList;

public class Exercicio3 {
	public static void main(String[] args) {
		try {
			int divisao = 100 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		try {
			PessoaExercicio3 nome = new PessoaExercicio3();
			nome = null;
			String pessoa = nome.nome;
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		try {
			String cachorro = "cachorro";
			cachorro.charAt(9);

		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		ArrayList<Integer> lista = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			lista.add(i);
		}

		try {
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}
}
