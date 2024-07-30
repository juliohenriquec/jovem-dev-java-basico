package aula2.poo.exercicio5;

import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

//não ta pronto!!
public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		pessoa1.nome = "João";
		LocalDate data1 = LocalDate.parse("20/01/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		pessoa1.dataNascimento = data1;

		pessoa2.nome = "Maria";
		LocalDate data2 = LocalDate.parse("20/01/1999", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		pessoa2.dataNascimento = data2;

		if (data1.compareTo(data2) < 0) {
			System.out.println(pessoa1.nome);
			System.out.println(LocalDate.now().compareTo(pessoa1.dataNascimento));
		} else {
			System.out.println(pessoa2.nome);
			System.out.println(LocalDate.now().compareTo(pessoa2.dataNascimento));
		}

	}
}
