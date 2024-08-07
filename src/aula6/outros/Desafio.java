package aula6.outros;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Desafio {
	 public static void main(String[] args) {
	        List<Evento> eventos = new ArrayList<>();
	        eventos.add(new Evento("Reunião de trabalho", LocalDateTime.of(2024, 8, 1, 10, 0), TipoEvento.PROFISSIONAL));
	        eventos.add(new Evento("Festa de aniversário", LocalDateTime.of(2024, 8, 20, 18, 0), TipoEvento.SOCIAL));
	        eventos.add(new Evento("Caminhada no parque", LocalDateTime.of(2024, 8, 7, 7, 0), TipoEvento.LAZER));
	        eventos.add(new Evento("Workshop de tecnologia", LocalDateTime.of(2024, 8, 15, 14, 0), TipoEvento.PROFISSIONAL));
	        eventos.add(new Evento("Jogo de futebol", LocalDateTime.of(2024, 7, 30, 16, 0), TipoEvento.LAZER));
	        eventos.add(new Evento("Jantar com amigos", LocalDateTime.of(2024, 8, 5, 20, 0), TipoEvento.SOCIAL));
	        eventos.add(new Evento("Compra de presentes", LocalDateTime.of(2024, 12, 10, 15, 0), TipoEvento.OUTROS));

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um tipo de evento (SOCIAL, LAZER, PROFISSIONAL, OUTROS): ");
	        String tipoEventoStr = scanner.nextLine().toUpperCase();

	        TipoEvento tipoEvento;
	        try {
	            tipoEvento = TipoEvento.valueOf(tipoEventoStr);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Tipo de evento inválido.");
	            scanner.close();
	            return;
	        }

	        LocalDateTime agora = LocalDateTime.now();
	        List<Evento> eventosJaOcorridos = eventos.stream()
	                .filter(evento -> evento.getTipo() == tipoEvento && evento.getDataHora().isBefore(agora))
	                .collect(Collectors.toList());

	        List<Evento> eventosNaoOcorridos = eventos.stream()
	                .filter(evento -> evento.getTipo() == tipoEvento && !evento.getDataHora().isBefore(agora))
	                .collect(Collectors.toList());

	        System.out.println("\nEventos que já ocorreram:");
	        eventosJaOcorridos.forEach(System.out::println);

	        System.out.println("\nEventos que ainda não ocorreram:");
	        eventosNaoOcorridos.forEach(System.out::println);

	        scanner.close();
	    }
}
