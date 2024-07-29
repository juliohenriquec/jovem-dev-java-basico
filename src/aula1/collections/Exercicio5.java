package aula1.collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio5 {

	public static void main(String[] args) {
		Set<Integer> conjunto1 = new HashSet<>();
		Set<Integer> conjunto2 = new HashSet<>();
		Set<Integer> interseccao = new HashSet<>();
		
		Random gerador = new Random();
		int numero;
		
		for(int i = 0; i < 10; i++) {
			numero = gerador.nextInt(30);
			conjunto1.add(numero);
		}
		System.out.println(conjunto1);
		
		for(int i = 0; i < 10; i++) {
			numero = gerador.nextInt(30);
			conjunto2.add(numero);
		}
		System.out.println(conjunto2);
		for(Integer a : conjunto1) {
			for(Integer b : conjunto2){
				if (conjunto1.contains(b)) {
					interseccao.add(b);
					}	
			}
		}	
		System.out.println(interseccao);
		}
		
	}
