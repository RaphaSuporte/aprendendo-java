package Exercício13;


import Exercicio10Mod.Endereco;

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



}
