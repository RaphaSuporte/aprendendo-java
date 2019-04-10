package Exercicio9;

import java.util.Scanner;

public class Exer9 {

    public static void main(String[] args) {

        int n = 1; // tamanho do vetor
        int v[] = new int[n]; // declaração do vetor "v"
        int i; //  posição


        System.out.println("Digite a Nota ");

        Scanner teclado = new Scanner(System.in);
        String nota = teclado.nextLine();

        String[] array = nota.split(",");

        for (i = 0; i < n; i++) {

            if (v[i] <= 1) {
                System.out.println("Vermelho");
            }
            if (v[i] <= 11) {
                System.out.println("Azul");

            }
            if (v[i] <= 21) {
                System.out.println("Branco");
            }
            if (v[i] <= 50) {
                System.out.println("Branco");
            }
            if (v[i] >=60) {
                System.out.println("Branco");

            }
        }
    }
}