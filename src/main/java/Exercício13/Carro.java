package Exercício13;

public class Carro extends AbstractVeiculos{


    private String nome;
    private int chassi;
    private double velocidadeMaxima;
    private int nrPortas;
    private int marchaRe = 0;
    private boolean temTetoSolar;
    private boolean temCambioAutomatico;
    private double volumeCombustivel;


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

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
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

    public void setVelocidadeAtual(int velocidadeAtual) {
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

    public Carro(String nome, int chassi, double velocidadeMaxima, int nrPortas, boolean temTetoSolar, boolean temCambioAutomatico, double volumeCombustivel) {
        this.nome = nome;
        this.chassi = chassi;
        this.velocidadeMaxima = velocidadeMaxima;
        this.nrPortas = nrPortas;
        this.temTetoSolar = temTetoSolar;
        this.temCambioAutomatico = temCambioAutomatico;
        this.volumeCombustivel = volumeCombustivel;
    }

    public int getTrocaMarcha(){
        if(velocidadeAtual>0 && velocidadeAtual <=20){
            return 1;
        }
        if(velocidadeAtual>21 && velocidadeAtual <=40){
            return 2;
        }
        if(velocidadeAtual>41 && velocidadeAtual <=60){
            return 3;
        }
        if(velocidadeAtual>61 && velocidadeAtual <=80){
            return 4;
        }
        if(velocidadeAtual>81){
            return 5;
        }
        return 0;
    }

    public void acelera(int acelera) {
        if (acelera >= velocidadeAtual) {
            acelera += velocidadeAtual;
        } else {
            System.out.println(" Atenção !! velocidade inválida !!");
        }
    }

    public void marchaRe() {
        if (velocidadeAtual == 0) {
            this.velocidadeAtual = marchaRe;
        } else {
            System.out.println("Velocidade Superior a 0 Km/h!");
        }
    }

    public void freia(){
        if (velocidadeAtual == 0){
            System.out.println("Veiculo Parado! ");
        }
    }
    public int ReduzMarcha(){
        if(velocidadeAtual>0 && velocidadeAtual <20){
            return 1;
        }
        if(velocidadeAtual>21 && velocidadeAtual <40){
            return 2;
        }
        if(velocidadeAtual>41 && velocidadeAtual <60){
            return 3;
        }
        if(velocidadeAtual>61 && velocidadeAtual <80){
            return 4;
        }
        if(velocidadeAtual<90){
            return 5;
        }
        return 0;
    }

}


