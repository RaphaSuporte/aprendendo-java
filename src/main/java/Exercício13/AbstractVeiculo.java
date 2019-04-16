package Exercício13;

abstract class AbstractVeiculos{

    protected String modelo;
    protected Marca marca;
    protected double velocidadeAtual;
    protected Proprietario proprietario;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;

    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Marca  getMarca() {
        return marca;
    }

    public void setMarca(Marca marca){
        this.marca = marca;
    }

}