package aula2.poo.exercicio6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pricinpal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		PessoaFisica pessoa2 = new PessoaFisica();

		pessoa1.nome = "João";
		LocalDate data1 = LocalDate.parse("20/01/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		pessoa1.dataNascimento = data1;

		pessoa2.nome = "Maria";
		LocalDate data2 = LocalDate.parse("14/10/2010", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		pessoa2.dataNascimento = data2;
		pessoa2.cpf = "206.709.500-50"; // usei um gerador de cpf aleatório, ou seja, ele não é válido.

		if (data1.isAfter(data2)) {
			System.out.println("Nome: " + pessoa1.nome);
			System.out.println("Data de Nascimento: " + pessoa1.dataNascimento);
		} else {
			System.out.println("Nome: " + pessoa2.nome);
			System.out.println("Data de Nascimento: " + pessoa2.dataNascimento);
			System.out.println("CPF: " + pessoa2.cpf);
		}

	}

}
