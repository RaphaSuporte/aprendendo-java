package Exercicio8;

import java.util.Scanner;

public class Exer8 {

    public static void main(String args[]) {

        double nota;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a Nota ");

        nota = teclado.nextDouble();

        if (nota >= 1 && nota <= 10) {
            System.out.println("vermelho");
        }
        if (nota >= 11 && nota <= 20) {
            System.out.println("Azul");

        }
        if (nota >= 21 && nota <= 50) {
            System.out.println("Amarelo");

        }
        if (nota > 50) {
            System.out.println("Branco");
        }
    }
}