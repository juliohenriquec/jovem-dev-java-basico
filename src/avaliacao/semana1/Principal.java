package avaliacao.semana1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import avaliacao.semana1.execeptions.QuantidadeException;
import avaliacao.semana1.model.Cliente;
import avaliacao.semana1.model.ItemVenda;
import avaliacao.semana1.model.Produto;
import avaliacao.semana1.model.Venda;

public class Principal {

	public static void main(String[] args) {
		new Principal();

	}

	// não acabado. Falta do item 5 para baixo. O item 11 eu fiz também.
	public Principal() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome do cliente:");
		String nome = sc.next();

		System.out.println("Data de nascimento do cliente:");
		String dataNascimento = sc.next();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

		Date date = null;
		try {
			date = formatter.parse(dataNascimento);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Cliente cliente = new Cliente(nome, date);
		Venda venda = new Venda();

		String nomeProduto = " ";

		while (true) {
			System.out.println("(Digite fim terminar)Nome do poduto:");
			nomeProduto = sc.next();

			if (nomeProduto.equalsIgnoreCase("fim")) {
				break;
			}

			System.out.println("Preço por unidade:");
			double preco = sc.nextDouble();

			Produto produto = new Produto(nomeProduto, preco);

			double quantidade;
			while (true) {
				try {
					System.out.println("Quantidade");
					quantidade = sc.nextDouble();
					if (quantidade <= 0) {
						throw new QuantidadeException(
								"A quantidade de produtos deve ser de no minímo 1 e no maxímo 50.");
					} else if (quantidade > 50) {
						throw new QuantidadeException(
								"A quantidade de produtos deve ser de no minímo 1 e no maxímo 50.");
					}
					break;

				} catch (QuantidadeException e) {
					e.printStackTrace();
				}
			}
			double precoTotal = quantidade * preco;
			ItemVenda item = new ItemVenda();
			venda.adicionarItem(item);

		}
		System.out.println("Forma de Pagamento\n 1 - Cartão de Crédito\n 2 - Cartão de Débito\n 3 - Dinheiro");
		int opFormaPagamento = sc.nextInt();
		String formaPagemento = "";
		if (opFormaPagamento == 1) {
			formaPagemento = "Cartão de Crédito";
		} else if (opFormaPagamento == 2) {
			formaPagemento = "Cartão de  Débito";
		} else if (opFormaPagamento == 3) {
			formaPagemento = "Cartão de Dinheiro";
		}

		sc.close();
	}

}
