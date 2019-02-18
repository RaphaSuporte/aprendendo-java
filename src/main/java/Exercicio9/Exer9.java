package Exercicio9;

import java.util.Scanner;

public class Exer9 {

    public static void main(String[] args) {

        System.out.println("Digite a Nota ");

        Scanner teclado = new Scanner(System.in);
        String nota = teclado.nextLine();

        String[] array = nota.split(",");


        if (array[0].equals("4")) {
            System.out.println("Vermelho");
        }
        if (array[1].equals("13")) {
            System.out.println("Azul");
        }
        if (array[2].equals("50")) {
            System.out.println("Amarelo");
        }
        if (array[3].equals("1000")) {
            System.out.println("Branco");

        }
    }
}
