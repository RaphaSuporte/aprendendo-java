package Exercício13;

public class Proprietario {

    private String nome;
    private int cpf;
    private int rg;
    private int dataNascimento;
    private Endereço;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public class Endereço{

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
    }

}
