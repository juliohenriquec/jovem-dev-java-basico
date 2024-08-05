package aula5.stream;

import java.util.ArrayList;
import java.util.Optional;

public class Exercicio5 {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Julio");
		nomes.add("Maria");
		nomes.add("Lucas");
		nomes.add("Ana");
		nomes.add("Lais");
		nomes.add("Leandro");
		nomes.add("João");
		nomes.add("Carlos");
		nomes.add("Alberto");
		nomes.add("Flavin do Pneu");

		Optional<String> berto = nomes.stream().filter(n -> n.endsWith("berto")).findFirst();
		System.out.println(berto);
	}
	
	
}
