package aula6.outros;


public class Exercicio2 {
	 public static void main(String[] args) {
	        int a = 10;
	        int b = 5;

	        System.out.println("Operações com a = " + a + " e b = " + b + ":");

	        for (Calculadora1Enum operacao : Calculadora1Enum.values()) {
	            System.out.println(operacao.getNomeAmigavel() + ": " + operacao.calcula(a, b));
	        }
	    }
}
