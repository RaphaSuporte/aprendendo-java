package Exercicio10Mod;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        ArrayList<Client> clients = new ArrayList<Client>();
        Client client1 = new Client("Lucas", 20000);
        Client client2 = new Client("Osvaldo", 10000);

        clients.add(client1);
        clients.add(client2);

        ArrayList<Passage> ticekts = new ArrayList<Passage>();
        Passage ticket1 = new Passage("VCP", "LAS", 3000);
        Passage ticket2 = new Passage("ROM", "LAS", 10000);

        ticekts.add(ticket1);
        ticekts.add(ticket2);

        Scanner scanner = new Scanner(System.in);
        String nome;
        Integer saldo = 0;
        Integer compra = 0;
        Boolean ticketFound;
        ticketFound = false;
        String origin;
        String destination;
        int i;


        System.out.println("Qual é o identificador do cliente?");
        nome = scanner.nextLine();
        for (i = 0; i > clients.size(); i++) {
            Client myClient = clients.get(i);
            if (myClient.getNome() == nome) {
                saldo = myClient.getPoints();
            }
        }


        if (saldo != 0) {

        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Qual a origem da passagem que deseja comprar?");
        origin = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Qual o Destino da passagem que deseja comprar?");
        destination = scanner2.nextLine();
        for (i = 0; i > ticekts.size(); i++) {

            //execução para aqui


            Passage myTickets = ticekts.get(i);
            if (myTickets.getOrigin() == origin && myTickets.getDestination() == destination) {
                saldo -= myTickets.getPoints();


            if (ticketFound == true) {
            }
            if (myTickets.getPoints() < 0) {
//                        System.out.println("Saldo em Pontos Insuficiente");
            } else {
//                      System.out.println("Passagem comprada com sucesso, você possui agora " + compra + " pontos!");
                }
            } else {
//                      System.out.println("Trecho não Encontrado");

            } else{
//                      System.out.println("Usuário não existe");
            }
        }
    }
}