package aula4.lambda;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno(1, "Thiago", LocalDate.of(2000, 1, 10)));
        alunos.add(new Aluno(2, "Tatiana", LocalDate.of(1999, 5, 20)));
        alunos.add(new Aluno(3, "Pedro", LocalDate.of(2001, 3, 15)));
        alunos.add(new Aluno(4, "Tom", LocalDate.of(2000, 8, 5)));
        alunos.add(new Aluno(5, "Tito", LocalDate.of(1998, 12, 30)));

        alunos.removeIf(aluno -> aluno.getNome().startsWith("T") && aluno.getNome().endsWith("O"));

        alunos.forEach(System.out::println);
	}
}
