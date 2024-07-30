package aula2.poo.exercicio4;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();

		carro1.modelo = "Civic";
		carro1.ano = 2008;
		carro1.cor = "Azul";
		JOptionPane.showMessageDialog(null, carro1.modelo + "\n" + carro1.ano + "\n" + carro1.cor);
		carro2.modelo = "Gol";
		carro2.ano = 2010;
		carro2.cor = "Cinza";
		JOptionPane.showMessageDialog(null, carro2.modelo + "\n" + carro2.ano + "\n" + carro2.cor);
		carro3.modelo = "Camaro";
		carro3.ano = 2014;
		carro3.cor = "Amarelo";
		JOptionPane.showMessageDialog(null, carro3.modelo + "\n" + carro3.ano + "\n" + carro3.cor);
	}

}
