package aula5.stream;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio3 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList();
		Random gerador = new Random();
		for (int i = 0; i < 50; i++) {
			int numero = gerador.nextInt(100);
			numeros.add(numero);
		}
		numeros.forEach(System.out::println);
		long contador = numeros.stream().filter(n -> n == 25).count();
		System.out.println("total: " + contador);
	}
}
