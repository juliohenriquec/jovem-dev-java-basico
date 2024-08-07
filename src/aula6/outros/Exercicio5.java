package aula6.outros;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;


public class Exercicio5 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a circunferência do círculo (inteiro): ");
	        int circunferenciaInt = scanner.nextInt();
	 
	        BigDecimal circunferencia = new BigDecimal(circunferenciaInt);

	        BigDecimal pi = new BigDecimal(Math.PI);
	        
	        BigDecimal dois = new BigDecimal(2);
	        BigDecimal denominador = dois.multiply(pi);
	        BigDecimal raio = circunferencia.divide(denominador, MathContext.DECIMAL128);
	        
	        raio = raio.setScale(4, RoundingMode.HALF_EVEN);
	        
	        System.out.println("O raio do círculo é: " + raio);
	        
	        scanner.close();
		
	}
}
