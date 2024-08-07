package aula7.testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula5.stream.Desafio;
import aula5.stream.Pessoa;
import aula7.testes.exceptions.ZeroException;

class DesafioTest {
	private List<Pessoa> pessoas;
	private static Desafio desafio;
	
	@BeforeAll
	static void init() {
		desafio = new Desafio();
	}
	
	@BeforeEach
	void setup() {
		pessoas = new ArrayList<>();
	}
	
	@DisplayName("Se a lista conter elementos")
	@Test
	void deveRetornarNomesDaLista() {
		pessoas.add(new Pessoa("Julio", LocalDate.of(2000, 1, 1), "9999999999"));
		pessoas.add(new Pessoa("Ana", LocalDate.of(2001, 9, 9), "9999999999"));
		pessoas.add(new Pessoa("Maria", LocalDate.of(1996, 2, 15), "9999999999"));
		pessoas.add(new Pessoa("Lucas", LocalDate.of(2004, 3, 10), "9999999999"));
		pessoas.add(new Pessoa("Thiago", LocalDate.of(2008, 4, 25), "9999999999"));
		pessoas.add(new Pessoa("Guilerme", LocalDate.of(1992, 5, 5), "9999999999"));
		pessoas.add(new Pessoa("Carlos", LocalDate.of(1997, 7, 14), "9999999999"));
		pessoas.add(new Pessoa("Julia", LocalDate.of(1995, 8, 20), "9999999999"));
		
		List<String> retorno = Desafio.nomesFiltrados(pessoas);
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Thiago");
		nomes.add("Maria");
		nomes.add("Lucas");
		nomes.add("Julio");
		nomes.add("Guilerme");
		nomes.add("Ana");
		
		assertEquals(nomes, retorno);
		
	}
	@DisplayName("Se a lista estiver vazia, deve disparar ZeroException")
	@Test
	void deveDispararExcecaoSeListaVazia() {
		assertThrows(ZeroException.class, () -> Desafio.nomesFiltrados(pessoas));
	}
}
