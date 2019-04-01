package Exercício12;

public class TesteElevator {

    public static void main(String[] args){

        int i;

        Elevator elevator = new Elevator(System.in);

        for (i = 0; i < elevator.quantidade; i ++){
            if (elevator.quantidade == 12){
                System.out.println("Elevador Cheio");
            }



        }



    }

}
