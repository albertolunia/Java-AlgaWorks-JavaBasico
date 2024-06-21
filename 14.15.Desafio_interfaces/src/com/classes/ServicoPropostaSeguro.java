package com.classes;

import com.interfaces.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem) {
        System.out.println(bem.descrever());
        System.out.println("Valor do prêmio: " + bem.calcularValorPremio());
    }
}
