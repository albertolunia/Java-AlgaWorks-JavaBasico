package com.classes;

import com.interfaces.BemSeguravel;

public class ImovelResidencial implements BemSeguravel {
    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return valorMercado * 0.001 + areaConstruida * 0.30;
    }

    @Override
    public String descrever() {
        return "Imóvel residencial com valor de mercado de R$ " + valorMercado + " e área construída de " + areaConstruida + " m²";
    }
}
