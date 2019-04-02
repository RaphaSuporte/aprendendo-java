package Exercício13;

public class Proprietario {

    private String nome;
    private int cpf;
    private int rg;
    private int dataNascimento;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;
    private String Complemento;

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private int getCpf() {
        return cpf;
    }

    private void setCpf(int cpf) {
        this.cpf = cpf;
    }

    private int getRg() {
        return rg;
    }

    private Proprietario(int rg) {
        this.rg = rg;
    }

    private int getDataNascimento() {
        return dataNascimento;
    }

    private void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    private String getRua() {
        return rua;
    }

    private void setRua(String rua) {
        this.rua = rua;
    }

    private String getBairro() {
        return bairro;
    }

    private void setBairro(String bairro) {
        this.bairro = bairro;
    }

    private String getCidade() {
        return cidade;
    }

    private void setCidade(String cidade) {
        this.cidade = cidade;
    }

    private String getEstado() {
        return estado;
    }

    private void setEstado(String estado) {
        this.estado = estado;
    }

    private int getCep() {
        return cep;
    }

    private void setCep(int cep) {
        this.cep = cep;
    }

    private String getComplemento() {
        return Complemento;
    }

    private void setComplemento(String complemento) {
        Complemento = complemento;
    }
}
