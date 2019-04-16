package Exercício13;


import java.util.Date;

public class Proprietario {

    private String nome;
    private long cpf;
    private long rg;
    private Date dataNascimento;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Proprietario(String nome, long cpf, long rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public static class Endereco {

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

}