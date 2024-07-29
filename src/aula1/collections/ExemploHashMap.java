package aula1.collections;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

	public static void main(String[] args) {
		Map<Integer, String> mapa = new HashMap<>();
		mapa.put(20, "José");
		mapa.put(35, "Maria");
		System.out.println(mapa.get(35));
		mapa.put(35 , "Claudia");
		System.out.println(mapa.get(35));
		mapa.remove(20);
		mapa.remove(35, "Claudia");
		System.out.println(mapa.isEmpty());
		System.out.println(mapa.get(35));

	}

}
