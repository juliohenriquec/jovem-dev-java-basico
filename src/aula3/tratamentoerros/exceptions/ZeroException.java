package aula3.tratamentoerros.exceptions;

public class ZeroException extends IllegalArgumentException {
	public ZeroException() {
		System.out.println("O segundo número não pode ser zero");
	}
}
