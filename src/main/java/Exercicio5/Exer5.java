package Exercicio5;

public class Exer5 {

    public static void main(String[] args){

        int [][]m = new int [10][3];
        for(int i = 0; i < 10 ; i++){
            for(int k = 0; k < 3 ; k++){
                m[i][k] = (int)(Math.random()*10);
            }
        }
        for(int i = 0; i < 10 ; i++){
            for(int k = 0; k < 3 ; k++){
                System.out.println (m[i][k]);
            }
        }
    }
}


