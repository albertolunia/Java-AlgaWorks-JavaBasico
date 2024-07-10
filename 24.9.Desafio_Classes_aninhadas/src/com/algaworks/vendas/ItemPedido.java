package com.algaworks.vendas;

import java.math.BigDecimal;

public class ItemPedido {
    private final String descricao;
    private int quantidade;
    private final BigDecimal valorUnitario;

    public ItemPedido(String descricao, int quantidade, BigDecimal valorUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(Pedido.getStatus() == StatusPedido.EMITIDO){
            throw new IllegalStateException("Pedido já emitido, quantidade não pode ser alterada");
        }
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public BigDecimal getValorTotal() {
        return valorUnitario.multiply(BigDecimal.valueOf(quantidade));
    }
}
