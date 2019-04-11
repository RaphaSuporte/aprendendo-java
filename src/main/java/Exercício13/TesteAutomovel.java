package Exercício13;

public class TesteAutomovel {

    public static void main(String[] args) {

        Proprietario proprietario = new Proprietario("Lucas",329865222,1546566666);
        Proprietario.Endereco endereco = new Proprietario.Endereco("Ai pai Para","Fala Fino","Campinas","São Paulo");
        Marca marca = new Marca("Fiat", 5, 2019,123);
        Carro carro = new Carro("147",523555555, 100,4,(false),(true),35);

        carro.setMarca(marca);

        System.out.println();

            }
        }