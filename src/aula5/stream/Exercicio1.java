package aula5.stream;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList();
		Random gerador = new Random();
		for (int i = 0; i < 50; i++) {
			int numero = gerador.nextInt(100);
			numeros.add(numero);
		}
		numeros.forEach(System.out::println);
		int soma = numeros.stream().mapToInt(Integer :: intValue).sum();
		System.out.println(soma);
	}
}
