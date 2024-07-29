package aula1.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio3 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		Set<Integer> semrepeticao = new HashSet<>();
		Random gerador = new Random();
		int numero;
		for(int i = 0; i < 50; i++) {
			numero = gerador.nextInt(20);
			lista.add(numero);
		}
		System.out.println("Original: " + lista);
		semrepeticao.addAll(lista);
		System.out.println("Sem repetição: "+ semrepeticao);
	}
}
