package Exercicio6;

import java.util.Arrays;

public class Exer6 {

    public static void main(String args[]) {

        int numero1, numero2, aux = 0;
        int ult = cap - 1;
        //agrupar em pares
        for (int i = 0; i < cap; i++) {
            numero1 = v[i];
            if (numero1 % 2 != 0) {
                aux = v[ult];
                if (aux % 2 == 0) {
                    v[ult] = numero1;
                    v[i] = aux;
                }
            }
            for (int j = i + 1; j < cap; j++) {
                numero2 = v[j];
                if (numero2 % 2 != 0) {
                    aux = v[ult];
                    if (aux % 2 == 0) {
                        v[ult] = numero2;
                        v[j] = aux;
                    }
                }
            }
            ult--;
        }
    }
    }


