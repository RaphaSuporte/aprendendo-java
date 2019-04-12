package Exercicio10Mod;

public class Endereco {

        private String rua;
        private String bairro;
        private String cidade;
        private String estado;
        private int cep;
        private String Complemento;

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public int getCep() {
            return cep;
        }

        public void setCep(int cep) {
            this.cep = cep;
        }

        public String getComplemento() {
            return Complemento;
        }

        public void setComplemento(String complemento) {
            Complemento = complemento;
        }

        public Endereco(String rua, String bairro, String cidade, String estado) {
            this.rua = rua;
            this.bairro = bairro;
            this.cidade = cidade;
            this.estado = estado;
        }
    }

