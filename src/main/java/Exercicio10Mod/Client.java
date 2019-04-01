package Exercicio10Mod;

public class Client {

    private String nome;
    private Integer points;


    public Client () {

    }

    public Client ( String nome, Integer points ) {
        this.setNome(nome);
        this.setPoints(points);
    }

    public Integer getPoints() {
        return points;
    }

    public String getNome () {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}


