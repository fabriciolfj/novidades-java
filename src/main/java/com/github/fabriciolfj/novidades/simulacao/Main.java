package com.github.fabriciolfj.novidades.simulacao;

import com.github.fabriciolfj.novidades.entity.Desenvolvedor;
import com.github.fabriciolfj.novidades.entity.Funcionario;
import com.github.fabriciolfj.novidades.entity.Gerente;

public class Main {

    public static void main(String[] args) {
        var desenv = new Desenvolvedor(36, "Fabircio", "alto", false);
        var gerente = new Gerente(42, "Carlos", 9932L, true);

        avaliarTipo(desenv);
        avaliarTipo(gerente);
        avalidarIdade(desenv);
        avalidarIdade(gerente);
    }

    private static void avalidarIdade(Funcionario funcionario) {
        var resultado = switch (funcionario.getIdade()) {
            case 36, 40, 23, 35 -> "Medio";
            case 20, 15 -> "Novo";
            default ->  "velho";
        };

        System.out.println(resultado);
    }

    private static void avaliarTipo(Funcionario funcionario) {
        if (funcionario instanceof Desenvolvedor desenvolvedor && desenvolvedor.isAtivo()){
            System.out.println("Desenvolvedor ativo");
        } else if (funcionario instanceof Gerente gerente && gerente.isAtivo()) {
            System.out.println("Gerente ativo");
        }
    }
}
