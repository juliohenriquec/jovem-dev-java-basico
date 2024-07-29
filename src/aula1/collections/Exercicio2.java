package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		Random gerador = new Random();
		int numero;
		for(int i = 0; i < 50; i++) {
			numero = gerador.nextInt(100);
			lista.add(numero);
			
		}
		Collections.sort(lista);
		Collections.reverse(lista);
		for(int i = 0; i < 50; i++) {
			System.out.print(lista.get(i) + " ");
		}
		
	}

}
