package Exercício13;

    abstract class veiculos{

        protected String modelo;
        protected String cor;
        protected String marca;
        protected double velocidadeAtual;
        private Proprietario proprietario;

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

        public veiculos(String modelo, String cor, String marca, double velocidadeAtual, Proprietario proprietario) {
            this.modelo = modelo;
            this.cor = cor;
            this.marca = marca;
            this.velocidadeAtual = velocidadeAtual;
            this.proprietario = proprietario;
        }
    }

