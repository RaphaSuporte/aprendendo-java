package Exercício13;

public class MarcaJava {

    private String nome;
    private int nrDeModelos;
    private int anoDeLancamento;
    private int codigoIdentificador;

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

    public MarcaJava(String nome, int nrDeModelos, int anoDeLancamento, int codigoIdentificador) {
        this.nome = nome;
        this.nrDeModelos = nrDeModelos;
        this.anoDeLancamento = anoDeLancamento;
        this.codigoIdentificador = codigoIdentificador;
    }
}
