package aula1.collections;

import java.util.ArrayList;
import java.util.List;

public class ExemploListas {
	public static void main(String[] args) {
		//LISTAS
		List<String> lista = new ArrayList<>();
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		lista.remove(0);
		lista.remove(0);
		System.out.println(lista.isEmpty());
	}
}
