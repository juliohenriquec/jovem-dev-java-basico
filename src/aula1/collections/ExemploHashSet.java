package aula1.collections;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {
		Set<String> conjunto = new HashSet();
		conjunto.add("Elemento 1");
		conjunto.add("Elemento 2");
		conjunto.add("Elemento 3");
		conjunto.add("Elemento 1");
		System.out.println(conjunto.size());
		conjunto.remove("Elemento 1");
		System.out.println(conjunto.size());

	}

}
