package Exercicio2;


import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {
        System.out.println("Entre True para Par ou False para Impar");
        Scanner entrada = new Scanner(System.in);
        boolean resposta = entrada.nextBoolean();
        System.out.println(resposta);

        if (resposta == true)
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0)
                    System.out.println("Par: " + i);

            }else

            for (int j = 0; j <= 100; j++) {
                if (j % 2 != 0)
                    System.out.println("Impar: " + j);

            }


        }

    }
