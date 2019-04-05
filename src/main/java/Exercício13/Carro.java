package Exercício13;

public class Carro {


    private String modelo;
    private String cor;
    private String marca;
    private int chassi;
    private String proprietario;
    private double velocidadeMaxima;
    private double velocidadeAtual;
    private int nrPortas;
    private int nrMarcha;
    private int marchaAtual;
    private int marchaRe = 0;
    private boolean temTetoSolar;
    private boolean temCambioAutomatico;
    private double volumeCombustivel;
    private boolean ligado = false;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getNrPortas() {
        return nrPortas;
    }

    public void setNrPortas(int nrPortas) {
        this.nrPortas = nrPortas;
    }

    public boolean isTemTetoSolar() {
        return temTetoSolar;
    }

    public void setTemTetoSolar(boolean temTetoSolar) {
        this.temTetoSolar = temTetoSolar;
    }

    public boolean isTemCambioAutomatico() {
        return temCambioAutomatico;
    }

    public void setTemCambioAutomatico(boolean temCambioAutomatico) {
        this.temCambioAutomatico = temCambioAutomatico;
    }

    public double getVolumeCombustivel() {
        return volumeCombustivel;
    }

    public void setVolumeCombustivel(double volumeCombustivel) {
        this.volumeCombustivel = volumeCombustivel;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void acelera() {
        this.velocidadeAtual++;
    }

    public void freia() {
        setVelocidadeAtual(0);
    }

    public void trocaMarcha() {
        if (marchaAtual < nrMarcha) {
            this.marchaAtual++;
        }

        public void reduzMarcha() {
            if (marchaAtual > 0) {
                this.marchaAtual--;
            }

            public int marchaRe(){
                if (velocidadeAtual > 0){
                    this.velocidadeAtual = marchaRe;
                }
                else {
                    System.out.println("Velocidade Superior a 0 Km/h!");
                }

                public double volumeCombustivel(){

                }
            }

        }
    }

}