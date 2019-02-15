package Exercicio5;

import java.util.Random;
public class Exer4 {
        public static void main(String[] args) {

            Random gerador = new Random(19700621);

            for (int i = 0; i < 10; i++) {
                System.out.println(gerador.nextInt(25));
            }
        }
    }


