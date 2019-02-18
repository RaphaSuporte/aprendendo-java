package Exercicio10;

public class Exer10 {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Lucas");
        cliente1.setPonto(10000);


        cliente1.imprimir();

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Osvaldo");
        cliente2.setPonto(20000);


        cliente2.imprimir();
    }
}
