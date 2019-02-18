package Exercicio7;

import java.util.Random;

public class Exer7 {

    private static int soParesEm() {
        Random mat = new Random();
        int par;
        do {
            par = mat.nextInt(30);
        } while (par % 2 != 0);
        return par;
    }

    public static void main(String[] args) {

        int[][] matriz = new int[5][5];

        Random mat = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = soParesEm();
            }

        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + "" + j + " " + matriz[i][j] + " ");
            }
            System.out.println("\n");
        }

    }

}