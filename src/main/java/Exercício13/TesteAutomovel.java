package Exercício13;

import Exercicio10Mod.Endereco;

public class TesteAutomovel {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Ai Pai Para","Fala Fino","campinas","são Paulo");
        Proprietario proprietario = new Proprietario("Lucas", 329856225, 65656656);
        Marca marca = new Marca("Chevrolet",1,2010,123);
        Carro carro = new Carro("Camaro",123568998,300,2,(true),(true),50,"Amarelo");



        carro.setMarca(marca);

        System.out.println("Nome Proprietário: " + proprietario.getNome() + "\n" + "Cpf: " + proprietario.getCpf() + "\n" + "Rg: " + proprietario.getRg());
        System.out.println("Endereço Rua: " + endereco.getRua() + "\n" + "Bairro: " + endereco.getBairro() + "\n" + "Cidade: " + endereco.getCidade() + "\n" +"Estado: " + endereco.getEstado());
        System.out.println("Marca: " + marca.getNome() + "\n" + "Ano Lançamento: "  + marca.getAnoDeLancamento() + "\n"  + "Código Identificador: " + marca.getCodigoIdentificador());
        System.out.println("Carro: " + carro.getModelo() + "\n" + "Cor: " + carro.getCor() + "\n" + "Chassi: " + carro.getChassi() + "\n" + "Numero de Portas: " + carro.getNrPortas());

            }
        }