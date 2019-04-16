package Exercício13;

public class TesteAutomovel {

    public static void main(String[] args) {

        Proprietario proprietario = new Proprietario("Lucas",329865222,1546566666);
        Proprietario.Endereco endereco = new Proprietario.Endereco("Ai pai Para","Fala Fino","Campinas","São Paulo");
        Marca marca = new Marca("Fiat", 5, 2019,123);
        Carro carro = new Carro("147","Amarelo",65656,2,0,(true),(false));

        System.out.println("Nome Proprietário: " + proprietario.getNome() + "\n" + "Cpf: " + proprietario.getCpf() + "\n" + "Rg: " + proprietario.getRg());
        System.out.println("Endereço Rua: " + endereco.getRua() + "\n" + "Bairro: " + endereco.getBairro() + "\n" + "Cidade: " + endereco.getCidade() + "\n" +"Estado: " + endereco.getEstado());
        System.out.println("Marca: "  + marca.nome + "\n" + "Ano Lançamento: " + marca.anoDeLancamento + "\n"  + "Código Identificador: " + marca.codigoIdentificador);
        System.out.println("Carro: " + carro.nome + "\n" + "Cor: " + carro.cor + "\n" + "Chassi: " + carro.chassi + "\n" + "Numero de Portas: " + carro.nrPortas + "\n" + "Tem câmbio Automático: " + carro.temCambioAutomatico + "\n" + "Tem Teto Solar: " + carro.temTetoSolar);
        System.out.println("Velocidade Atual: " + carro.getVelocidadeAtual());


    }
}