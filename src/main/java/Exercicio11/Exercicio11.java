package Exercicio11;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio11 {

    public static void main(String[] args) {

        int N1;
        int N2;

        String operacao = "";
        int control=0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a operação que deseja efetuar");
        operacao = entrada.nextLine();

        System.out.println("Digite o Primeiro Numero");
        N1 = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o Segundo Numero");
        N2 = Integer.parseInt(entrada.nextLine());

        if(operacao.equals("+")){
            System.out.println("O Resultado da Soma é:" + (N1 + N2));
            control++;
        }
        if(operacao.equals("-")){
            System.out.println("O Resultado da Subtração é:" + (N1 - N2));
            control++;
        }
        if(operacao.equals("*")){
            System.out.println("O Resultado da Multiplicação é:" + (N1 * N2));
            control++;
        }
        if(operacao.equals("/")){
            System.out.println("O Resultado da Divisão é:" + (N1 / N2));
            control++;
        }

        if(control == 0){
            System.out.println("Operação inválida, tente Novamente!");
        }
    }
}