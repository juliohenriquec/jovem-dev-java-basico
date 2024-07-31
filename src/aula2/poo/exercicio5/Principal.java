package aula2.poo.exercicio5;

import java.text.Format;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

//não ta pronto!!
public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		pessoa1.nome = "João";
		LocalDate data1 = LocalDate.parse("20/01/1998", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		pessoa1.dataNascimento = data1;

		pessoa2.nome = "Maria";
		LocalDate data2 = LocalDate.parse("20/01/1999", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		pessoa2.dataNascimento = data2;
		nomePessoaMaisVelha(pessoa1, pessoa2);
	}

	public static void nomePessoaMaisVelha(Pessoa p1, Pessoa p2) {
		if (p1.dataNascimento.isBefore(p2.dataNascimento)) {
			System.out.println("Nome: " + p1.nome + " \nidade: " + getIdade(p1.dataNascimento));
		} else {
			System.out.println("Nome: " + p2.nome + " \nidade: " + getIdade(p2.dataNascimento));
		}
	}

	public static int getIdade(LocalDate dataNascimento) {
		return LocalDate.now().compareTo((ChronoLocalDate) dataNascimento);
	}
}
