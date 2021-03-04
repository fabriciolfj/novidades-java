package com.github.fabriciolfj.novidades.entity;

public abstract sealed class Funcionario permits Gerente, Desenvolvedor {

    private Integer idade;
    private String nome;

    public Funcionario() {

    }

    public Funcionario(Integer idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
