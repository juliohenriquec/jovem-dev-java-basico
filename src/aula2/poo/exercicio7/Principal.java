package aula2.poo.exercicio7;

public class Principal {
	public static void main(String[] args) {
		NotaFiscal notaFiscal1 = new NotaFiscal();
		NotaFiscal notaFiscal2 = new NotaFiscal();

		notaFiscal1.emitente = "TrierSistemas";
		notaFiscal2.emitente = "Giassi";

		System.out
				.println("Emitente: " + notaFiscal1.emitente + " | Valor Final: " + notaFiscal1.calculaValor(100, 10));
		System.out
				.println("Emitente: " + notaFiscal2.emitente + " | Valor Final: " + notaFiscal2.calculaValor(150, 15));
	}
}
