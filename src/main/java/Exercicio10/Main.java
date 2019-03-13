package Exercicio10;

import java.util.HashMap;
import java.util.Scanner;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

public class Main {


    public static void main ( String[] args ) {

        Client client1 = new Client ( "Lucas", 20000 );
        Client client2 = new Client ( "Osvaldo", 10000 );

        HashMap<String, Integer> clients = new HashMap ();

        clients.put ( client1.getNome (), client1.getPoints () );
        clients.put ( client2.getNome (), client2.getPoints () );

        Passage ticket1 = new Passage ( "VCP", "LAS", 3000 );
        Passage ticket2 = new Passage ( "ROM", "LAS", 10000 );

        HashMap<String, Passage> tickets = new HashMap<String, Passage> ();
        tickets.put ( "VL8520", ticket1 );
        tickets.put ( "RL6325", ticket2 );

        Scanner scanner = new Scanner ( System.in );
        final String nome;
        final AtomicReference<Integer> saldo = new AtomicReference<> ();
        final AtomicReference<Integer> compra = new AtomicReference<> ();
        final AtomicReference<Boolean> ticketFound = new AtomicReference<> ();
        ticketFound.set ( false );
        saldo.set ( 0 );
        compra.set ( 0 );
        final String origin;
        final String destination;


        System.out.println ( "Qual é o identificador do cliente?" );
        nome = scanner.nextLine ();
        clients.forEach (new BiConsumer<String, Integer>() {
            public void accept(String index, Integer client) {
                if (nome.equals(index)) {
                    saldo.set(client);
                }
            }
        });

        if (saldo.get () != 0) {

            Scanner scanner1 = new Scanner ( System.in );
            System.out.println ( "Qual a origem da passagem que deseja comprar?" );
            origin = scanner1.nextLine ();
            Scanner scanner2 = new Scanner ( System.in );
            System.out.println ( "Qual o Destino da passagem que deseja comprar?" );
            destination = scanner2.nextLine ();

            tickets.forEach (new BiConsumer<String, Passage>() {
                public void accept(String index, Passage ticket) {
                    if (origin.equals(ticket.getOrigin()) && destination.equals(ticket.getDestination())) {
                        compra.set(saldo.get() - ticket.getPoints());
                        ticketFound.set(true);
                    }
                }
            });
            if (ticketFound.get ()) {

                if (compra.get () < 0) {
                    System.out.println ( "Saldo em Pontos Insuficiente" );
                } else {
                    System.out.println ( "Passagem comprada com sucesso, você possui agora " + compra + " pontos!" );
                }
            } else {
                System.out.println ("Trecho não Encontrado");

            }
        } else {
            System.out.println ( "Usuário não existe" );
        }

    }
}




