package aula5.stream;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataDeNascimento;
    private String telefone;

    public Pessoa(String nome, LocalDate dataDeNascimento, String telefone) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    @Override
    public String toString() {
        return "nome= " + nome +
                ", dataDeNascimento= " + dataDeNascimento +
                ", telefone= " + telefone;
    }
}
