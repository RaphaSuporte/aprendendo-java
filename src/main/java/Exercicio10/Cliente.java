package Exercicio10;

public class Cliente {

    private String nome;
    private Integer pontos;

    public Cliente () {

    }
    public Cliente(String nome, Integer pontos){
        this.getNome ();
        this.getPontos ();
    }


    public String getNome(){
        return nome;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }
    public Integer getPontos () {
        return pontos;
    }

    public void setPontos ( Integer pontos ) {
        this.pontos = pontos;
    }
}
