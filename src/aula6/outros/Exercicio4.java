package aula6.outros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String nome = JOptionPane.showInputDialog("Digite o primeiro nome.");
		String data1 = JOptionPane.showInputDialog("Digite a data de nascimento.");
		LocalDate dataDeNascimento = LocalDate.parse(data1, formatter);
		String telefone = JOptionPane.showInputDialog("Digite o telefone.");
		Pessoa pessoa1 = new Pessoa(nome, dataDeNascimento, telefone);

		String nome2 = JOptionPane.showInputDialog("Digite o segundo nome.");
		String data2 = JOptionPane.showInputDialog("Digite a data de nascimento.");
		LocalDate dataDeNascimento2 = LocalDate.parse(data2, formatter);
		String telefone2 = JOptionPane.showInputDialog("Digite o telefone.");
		Pessoa pessoa2 = new Pessoa(nome2, dataDeNascimento2, telefone2);

		if (pessoa1.getDataDeNascimento().isBefore(pessoa2.getDataDeNascimento())) {
			System.out.println(pessoa1.toString());
		} else {
			System.out.println(pessoa2.toString());
		}
	}

}
