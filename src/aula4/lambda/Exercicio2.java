package aula4.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno(1, "João", LocalDate.of(2000, 1, 10)));
        alunos.add(new Aluno(2, "Maria", LocalDate.of(1999, 5, 20)));
        alunos.add(new Aluno(3, "Pedro", LocalDate.of(2001, 3, 15)));
        alunos.add(new Aluno(4, "Ana", LocalDate.of(2000, 8, 5)));
        alunos.add(new Aluno(5, "Lucas", LocalDate.of(1998, 12, 30)));

        alunos.sort(Comparator.comparing(Aluno::getDataNascimento));

        alunos.forEach(System.out::println);
    }
}