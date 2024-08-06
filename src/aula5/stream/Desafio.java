package aula5.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa("Julio", LocalDate.of(2000, 1, 1), "9999999999"));
		pessoas.add(new Pessoa("Ana", LocalDate.of(2001, 9, 9), "9999999999"));
		pessoas.add(new Pessoa("Maria", LocalDate.of(1996, 2, 15), "9999999999"));
		pessoas.add(new Pessoa("Lucas", LocalDate.of(2004, 3, 10), "9999999999"));
		pessoas.add(new Pessoa("Thiago", LocalDate.of(2008, 4, 25), "9999999999"));
		pessoas.add(new Pessoa("Guilerme", LocalDate.of(1992, 5, 5), "9999999999"));
		pessoas.add(new Pessoa("Matheus", LocalDate.of(1993, 6, 30), "9999999999"));
		pessoas.add(new Pessoa("Carlos", LocalDate.of(1997, 7, 14), "9999999999"));
		pessoas.add(new Pessoa("Julia", LocalDate.of(1995, 8, 20), "9999999999"));
		pessoas.add(new Pessoa("Juliano", LocalDate.of(1994, 10, 13), "9999999999"));

		
		  List<String> nomesFiltrados = pessoas.stream()
	                .filter(p -> {
	                    char primeiroCaractere = p.getNome().toLowerCase().charAt(0);
	                    boolean comecaComVogal = "aeiou".indexOf(primeiroCaractere) != -1;
	                    boolean anoBissexto = p.getDataDeNascimento().isLeapYear();
	                    return comecaComVogal || anoBissexto;
	                })
	                .map(Pessoa::getNome)
	                .sorted((n1, n2) -> n2.compareTo(n1)) 
	                .collect(Collectors.toList());

	     
	        String resultado = String.join("; ", nomesFiltrados);
	        System.out.println(resultado);
	}

}
