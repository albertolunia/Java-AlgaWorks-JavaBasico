package com.algaworks.financeiro;

public class ContaPagar {
    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago;
    private Fornecedor fornecedor;

    public boolean isPago() {
        return this.pago;
    }

    public void pagar() {
        if (!this.isPago()) {
            this.pago = true;
        } else {
            System.out.println("Conta já paga.\n");
        }
    }

    public void cancelarPagamento() {
        if (this.isPago()) {
            this.pago = false;
        } else {
            System.out.println("Conta ainda não paga.\n");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
