package aula5.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicio4 {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Julio", LocalDate.of(2003, 01, 01), "9999999999");
		Pessoa pessoa2 = new Pessoa("Maria", LocalDate.of(2003, 02, 01), "9999999999");
		Pessoa pessoa3 = new Pessoa("Lucas", LocalDate.of(2003, 03, 01), "9999999999");
		Pessoa pessoa4 = new Pessoa("Thiago", LocalDate.of(2003, 05, 01), "9999999999");
		Pessoa pessoa5 = new Pessoa("Guilerme", LocalDate.of(2003, 05, 01), "9999999999");
		Pessoa pessoa6 = new Pessoa("Matheus", LocalDate.of(2003, 05, 01), "9999999999");
		Pessoa pessoa7 = new Pessoa("Carlos", LocalDate.of(2003, 04, 01), "9999999999");
		Pessoa pessoa8 = new Pessoa("Julia", LocalDate.of(2003, 01, 01), "9999999999");
		Pessoa pessoa9 = new Pessoa("Ana", LocalDate.of(2003, 10, 01), "9999999999");
		Pessoa pessoa10 = new Pessoa("Juliano", LocalDate.of(2003, 05, 01), "9999999999");

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		pessoas.add(pessoa5);
		pessoas.add(pessoa6);
		pessoas.add(pessoa7);
		pessoas.add(pessoa8);
		pessoas.add(pessoa9);
		pessoas.add(pessoa10);

		pessoas.stream().filter(p -> p.getNascimento().getMonthValue() == 5).forEach(System.out::println);
	}
}
