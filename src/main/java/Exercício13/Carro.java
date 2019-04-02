package Exercício13;

public class Carro {

    String modelo;
    String cor;
    String marca;
    int chassi;
    String proprietário;
    double velocidadeMaxima;
    double velocidadeAtual;
    int nrPortas;
    Boolean temTetoSolar;
    Boolean temCambioAutomatico;
    double volumeCombustivel;

    private String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String getCor() {
        return cor;
    }

    private void setCor(String cor) {
        this.cor = cor;
    }

    private String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    private int getChassi() {
        return chassi;
    }

    private void setChassi(int chassi) {
        this.chassi = chassi;
    }

    private String getProprietário() {
        return proprietário;
    }

    private void setProprietário(String proprietário) {
        this.proprietário = proprietário;
    }

    private double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    private void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    private double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    private void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    private int getNrPortas() {
        return nrPortas;
    }

    private void setNrPortas(int nrPortas) {
        this.nrPortas = nrPortas;
    }

    private Boolean getTemTetoSolar() {
        return temTetoSolar;
    }

    private void setTemTetoSolar(Boolean temTetoSolar) {
        this.temTetoSolar = temTetoSolar;
    }

    private Boolean getTemCambioAutomatico() {
        return temCambioAutomatico;
    }

    private void setTemCambioAutomatico(Boolean temCambioAutomatico) {
        this.temCambioAutomatico = temCambioAutomatico;
    }

    private double getVolumeCombustivel() {
        return volumeCombustivel;
    }

    private void setVolumeCombustivel(double volumeCombustivel) {
        this.volumeCombustivel = volumeCombustivel;
    }
}
