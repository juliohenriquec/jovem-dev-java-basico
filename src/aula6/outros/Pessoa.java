package aula6.outros;

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
        return String.format(" nome= %s %n dataDeNascimento= %s %n telefone=  %s", nome,dataDeNascimento, telefone);
    }
}
