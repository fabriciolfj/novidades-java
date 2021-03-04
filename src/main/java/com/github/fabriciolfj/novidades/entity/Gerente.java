package com.github.fabriciolfj.novidades.entity;

public final class Gerente extends Funcionario {

   private Long numeroSubordinados;
   private boolean ativo;

    public Gerente(Integer idade, String nome, Long numeroSubordinados, boolean ativo) {
        super(idade, nome);
        this.numeroSubordinados = numeroSubordinados;
        this.ativo = ativo;
    }

    public boolean isAtivo() {
        return ativo;
    }

}
