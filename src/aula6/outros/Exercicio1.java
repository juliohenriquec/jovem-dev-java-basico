package aula6.outros;

public class Exercicio1 {
	public static void main(String[] args) {
		for(DiaSemanaEnum dia : DiaSemanaEnum.values()) {
			System.out.println(dia.getdiaDaSemana() + " é final de semana?  " + dia.isFimDeSemana());
		}
	}

}
