package Exercicio10;

public class Cliente {
    private String nome;
    private String ponto;

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontos: " + ponto);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = getNome();
    }

    public String getsaldopontos(int i) {
        return ponto;
    }

    public void setPonto(int ponto) {
        this.ponto = (String) getsaldopontos(10000);
    }

}

