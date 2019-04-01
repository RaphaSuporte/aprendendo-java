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

        ArrayList<Passage> tickets = new ArrayList<Passage>();
        Passage ticket1 = new Passage("VCP", "LAS", 3000);
        Passage ticket2 = new Passage("ROM", "LAS", 10000);

        tickets.add(ticket1);
        tickets.add(ticket2);

        Scanner scanner = new Scanner(System.in);
        String nome;
        Integer saldo = 0;
        Integer compra = 0;
        String origin;
        String destination;
        boolean ticketFound = false;
        int i;


        System.out.println("Qual é o Identificador do Cliente? ");
        nome = scanner.nextLine();
        for (i = 0; i < clients.size(); i++) {
            Client myClient = clients.get(i);
            saldo = myClient.getPoints();
            if (myClient.getNome().equals(nome)) {
                if (saldo <= 0) {
                    System.out.println("Saldo em Pontos Insuficiente! ");
                }

                if (saldo != 0) {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Qual Origem da Passagem Deseja Comprar? ");
                    origin = scanner1.nextLine();

                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Qual Destino da Passagem Deseja Comprar? ");
                    destination = scanner2.nextLine();

                    for (i = 0; i < tickets.size(); i++) {
                        Passage myTickets = tickets.get(i);
                        if (myTickets.getOrigin().equals(origin)) {
                            saldo = myClient.getPoints();
                            compra = myTickets.getPoints();
                            int total = 0;
                            total = saldo -= compra;


                            if (saldo < 0) {
                                System.out.println("Saldo Insuficiente!");

                                System.exit(0);


                            }
                            if (myTickets.getOrigin().equals(origin) && myTickets.getDestination().equals(destination)) {
                                ticketFound = true;
                                System.out.println("Passagem Comprada com Sucesso, você possui agora " + saldo + " Pontos! ");

                                System.exit(0);


                            }
                            if (ticketFound == false) {
                                System.out.println("Passagem Não Existe!");

                                System.exit(0);
                            }

                        }

                    }
                }
            }
        }
    }
}






