package aula2.poo.exercicio7;

public class NotaFiscal {
	String emitente;
	private static double valor;

	public static double calculaValor(double valorBruto, double valorDesconto) {
		valor = valorBruto - valorDesconto;
		return valor;

	}
}
