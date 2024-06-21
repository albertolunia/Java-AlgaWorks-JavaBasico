package com.classes;

public class Caminhao extends VeiculoAutomotor{

    private int quantidadeDeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeDeEixos) {
        super(anoFabricacao, valorMercado, modelo);
        this.quantidadeDeEixos = quantidadeDeEixos;
    }

    @Override
    public double calcularValorPremio() {
        double valorDoPremio = getValorMercado() * 0.02;
        for(int i = 0; i < quantidadeDeEixos; i++){
            valorDoPremio += 50;
        }
        return valorDoPremio;
    }

    @Override
    public String descrever() {
        return "";
    }
}
