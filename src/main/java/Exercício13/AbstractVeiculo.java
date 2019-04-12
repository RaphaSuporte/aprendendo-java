package Exercício13;

   abstract class AbstractVeiculo
   {

        protected String modelo;
        protected String cor;
        protected Marca marca;
        protected double velocidadeAtual;
        protected Proprietario proprietario;

        public class Carro extends AbstractVeiculo{

        }

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

