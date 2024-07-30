package aula2.poo.exercicio3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		LocalDate data = LocalDate.parse(JOptionPane.showInputDialog("Digite um data."),
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		DayOfWeek diaDaSemana = DayOfWeek.from(data);
		JOptionPane.showMessageDialog(null, diaDaSemana);

	}

}
