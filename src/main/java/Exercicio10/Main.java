package Exercicio10;

import java.util.Scanner;

public class Main {



    public static void main(String[] args){
        Scanner scanner = new Scanner ( System.in );
        System.out.println ("Qual é o identificador do cliente?");
        scanner.next ();
        System.out.println ("Qual a origem da passagem que deseja comprar?");
        scanner.next ();
        System.out.println ("Qual a destino da passagem que deseja comprar?");
        scanner.next ();

        Scanner in = new Scanner(System.in);
        String[] nome = new String[2];
        for (int i = 0; i < 2; i++)
        {
            System.out.print("Nome: " + i);
            nome[i] = in.nextLine();
        }


    }

}




