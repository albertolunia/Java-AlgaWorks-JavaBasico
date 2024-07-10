package com.algaworks.vendas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final Cliente cliente;
    private final List<ItemPedido> itens = new ArrayList<>();
    private static StatusPedido status = StatusPedido.AGUARDANDO;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemPedido adicionarItem(String descricao, int quantidade, BigDecimal valorUnitario) {
        ItemPedido item = new ItemPedido(descricao, quantidade, valorUnitario);
        itens.add(item);
        return item;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public BigDecimal getValorTotal() {
        return itens.stream()
                .map(ItemPedido::getValorTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void emitir() {
        status = StatusPedido.EMITIDO;
        System.out.println("Pedido emitido para o cliente " + cliente.getNome());
    }

    public static StatusPedido getStatus() {
        return status;
    }

}


