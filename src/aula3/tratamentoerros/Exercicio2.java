package aula3.tratamentoerros;

import aula3.tratamentoerros.exceptions.ZeroException;

public class Exercicio2 {
	public static void main(String[] args) {
		divisao(10, 0);
	}

	public static void divisao(int num1, int num2) {
		try {
			if (num2 == 0) {
				throw new ZeroException();
			}
			int divisao;
			System.out.println(divisao = num1 / num2);
		} catch (ZeroException e) {
			e.printStackTrace();
		}
	}
}