package aula4.lambda;

import java.time.LocalDate;

public class Aluno {
	private int numeroChamada;
	private String nome;
	private LocalDate dataNascimento;

	public Aluno(int numeroChamada, String nome, LocalDate dataNascimento) {
		this.numeroChamada = numeroChamada;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome.toUpperCase();
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	@Override
	public String toString() {
		return "Numero da chamada = " + numeroChamada + " | Nome = " + nome + " | Data de Nascimento = "
				+ dataNascimento;
	}
}
