package aula6.outros;

public class Exercicio1 {
	public static void main(String[] args) {
		System.out.println(DiaSemanaEnum.DOMINGO.getdiaDaSemana() + " é final de semana?  " + DiaSemanaEnum.DOMINGO.isFimDeSemana());
		System.out.println(DiaSemanaEnum.SEGUNDA.getdiaDaSemana() + " é final de semana? " + DiaSemanaEnum.SEGUNDA.isFimDeSemana());
		System.out.println(DiaSemanaEnum.TERCA.getdiaDaSemana() + " é final de semana? " + DiaSemanaEnum.TERCA.isFimDeSemana());
		System.out.println(DiaSemanaEnum.QUARTA.getdiaDaSemana() + " é final de semana? " + DiaSemanaEnum.QUARTA.isFimDeSemana());
		System.out.println(DiaSemanaEnum.QUINTA.getdiaDaSemana() + " é final de semana? " + DiaSemanaEnum.QUINTA.isFimDeSemana());
		System.out.println(DiaSemanaEnum.SEXTA.getdiaDaSemana() + " é final de semana? " + DiaSemanaEnum.SEXTA.isFimDeSemana());
		System.out.println(DiaSemanaEnum.SABADO.getdiaDaSemana() + " é final de semana? " + DiaSemanaEnum.SABADO.isFimDeSemana());
	}

}
