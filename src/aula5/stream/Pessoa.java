package aula5.stream;

import java.time.LocalDate;

public class Pessoa {

	static String nome;
	static LocalDate nascimento;
	static String telefone;
	
	public Pessoa(String nome,LocalDate nascimento,String telefone ) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.telefone = telefone;
	}
	
	public static String getNome() {
		return nome;

	}
	
	public LocalDate getNascimento() {
		return nascimento;

	}
	
	public static String gettelefone() {
		return telefone;

	}
	public String toString() {
		return nome;
		
	}
	
}
