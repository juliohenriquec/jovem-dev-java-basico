package aula4.lambda;

import java.util.ArrayList;

public class Desafio {
	public static void main(String[] args) {
		ArrayList<String> palavras = new ArrayList();
		
		palavras.add("Carro");
		palavras.add("Bola");
		palavras.add("Café");
		palavras.add("Teclado");
		palavras.add("Mouse");
		
		palavras.forEach(Mostrador::mostra);
	}
}
