package aula5.stream;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList();
		Random gerador = new Random();
		for (int i = 0; i < 50; i++) {
			int numero = gerador.nextInt(100);
			numeros.add(numero);
		}
		numeros.forEach(System.out::println);
		OptionalDouble media = numeros.stream().filter(n -> n > 50).mapToDouble(Integer :: doubleValue).average();
		System.out.print("média: " + media);
	}
}
