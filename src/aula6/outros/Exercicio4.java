package aula6.outros;

import java.time.LocalDate;

public class Exercicio4 {
	
	public static void main(String[] args) {
		String nome = "Julio";
		LocalDate dataDeNascimento = LocalDate.of(2003, 3, 14);
		String telefone = "(99) 9999-9999";
		Pessoa pessoa1 = new Pessoa(nome, dataDeNascimento, telefone);
		
		String nome2 = "Julia";
		LocalDate dataDeNascimento2 = LocalDate.of(2003, 2, 14);
		String telefone2 = "(99) 9999-9999";
		Pessoa pessoa2 = new Pessoa(nome2, dataDeNascimento2, telefone2);
		
		if(pessoa1.getDataDeNascimento().isBefore(pessoa2.getDataDeNascimento())) {
			System.out.println(pessoa1.toString());
		}else {
			System.out.println(pessoa2.toString());
		}
	}
	

}
