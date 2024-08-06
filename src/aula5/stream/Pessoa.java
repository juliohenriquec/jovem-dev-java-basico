package aula5.stream;

import java.time.LocalDate;

class Pessoa {
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
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
