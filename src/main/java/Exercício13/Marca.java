package Exercício13;

public class Marca {

    protected String nome;
    protected int nrDeModelos;
    protected int anoDeLancamento;
    protected int codigoIdentificador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNrDeModelos() {
        return nrDeModelos;
    }

    public void setNrDeModelos(int nrDeModelos) {
        this.nrDeModelos = nrDeModelos;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(int codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public Marca(String nome, int nrDeModelos, int anoDeLancamento, int codigoIdentificador) {
        this.nome = nome;
        this.nrDeModelos = nrDeModelos;
        this.anoDeLancamento = anoDeLancamento;
        this.codigoIdentificador = codigoIdentificador;
    }
}