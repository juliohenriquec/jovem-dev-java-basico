package aula4.lambda;

import java.util.function.Consumer;

public interface Mostrador {
	
	 static void mostra(String a) {
		System.out.println(a.toUpperCase()); 
	}

}
