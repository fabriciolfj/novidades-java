package com.github.fabriciolfj.novidades.entity;

public final class Desenvolvedor extends Funcionario {

    private String nivelConhecimento;
    private boolean ativo;

    public Desenvolvedor(Integer idade, String nome, String nivelConhecimento, boolean ativo) {
        super(idade, nome);
        this.nivelConhecimento = nivelConhecimento;
        this.ativo = ativo;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
