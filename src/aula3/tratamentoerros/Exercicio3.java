package aula3.tratamentoerros;

import java.util.ArrayList;
import java.util.Iterator;

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

		try {
			ArrayList<String> list = new ArrayList<>();
			list.add("Item 1");

			Iterator<String> iterator = list.iterator();
			iterator.remove();

		} catch (IllegalStateException e) {
			e.printStackTrace();a
		}
	}
}
