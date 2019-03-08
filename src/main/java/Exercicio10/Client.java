package Exercicio10;

public class Client {

    private String nome;
    private Integer points;


    public Client () {

    }

    public Client ( String nome, Integer points ) {
        this.nome = nome;
        this.points = points;
    }

    public Integer getPoints () {
        return points;
    }

    public String getNome () {
        return nome;
    }

    }

