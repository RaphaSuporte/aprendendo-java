package Exercicio2;

import java.util.ArrayList;
import java.util.Random;


public class Main {

        public static void main(String[] args) {

            //cria arraylist
            ArrayList<Integer> al = new ArrayList<Integer>();


            //preenche arraylist
            for(int a = 1; a < 100; a++){
                al.add(a);
            }

            //lê arraylist e imprime se for par

            for(int a : al){
                if( (a % 2) == 0)
                    System.out.println("Par encontrado: " + a);
            }


            System.out.println("AGORA PREENCHENDO RANDOMICAMENTE");

            Random r = new Random();

            //preenche arraylist
            for(int a = 1; a < 100; a++){
                al.add(r.nextInt(100));
            }

            System.out.println("E IMPRIMINDO NOVAMENTE BUSCANDO DENTRE OS ALEATÓRIOS");
            for(int a : al){
                if( (a % 2) == 0)
                    System.out.println("Par encontrado: " + a);
            }

        }
    }

