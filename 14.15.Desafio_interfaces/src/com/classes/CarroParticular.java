package com.classes;

public class CarroParticular extends VeiculoAutomotor{

    public CarroParticular(int anoFabricacao, double valorMercado, String modelo) {
        super(anoFabricacao, valorMercado, modelo);
    }

    @Override
    public double calcularValorPremio() {
        double valorDoPremio = getValorMercado() * 0.04;
        if(getAnoFabricacao() < 2000)
            return valorDoPremio * 0.06;
        return valorDoPremio;
    }

    @Override
    public String descrever() {
        return "Carro particular: " + getModelo() + " - " + getAnoFabricacao();
    }
}
