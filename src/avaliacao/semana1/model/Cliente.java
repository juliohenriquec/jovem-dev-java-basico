package avaliacao.semana1.model;

import java.time.LocalDate;
import java.util.Date;

public class Cliente {
	private static String nome;
	private static Date dataNascimento;
	private static boolean aniversario = false;

	public static void main(String[] args) {
		new Cliente(nome, dataNascimento);
	}

	public Cliente(String nome, Date dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.aniversario = aniversario;
	}

	public static String getNome() {
		return nome;

	}

	public static Date getData() {
		return dataNascimento;

	}

	public static boolean getaniversario() {
		return aniversario;

	}

}
