package aula2.poo.desafio;

public class Carro {
	String modelo;
	int ano;

	public Carro(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public int getIdade(int anoAtual) {
		return anoAtual - ano;
	}

	public String toString() {
		return "Modelo: " + modelo + ", Ano: " + ano;
	}
}
