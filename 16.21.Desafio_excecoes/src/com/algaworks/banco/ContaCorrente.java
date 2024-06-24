package com.algaworks.banco;

public class ContaCorrente {
    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }


    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public boolean sacar(double valor) {
        if (!ativa) {
            throw new ContaInativaException("Conta inativa");
        }

        if (saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }

        saldo -= valor;
        return true;
    }

    public void depositar(double valor) {
        if (!ativa) {
            throw new ContaInativaException("Conta inativa");
        }

        saldo += valor;
    }

    public void transferir(ContaCorrente destino, double valor) {
        if (!ativa) {
            throw new ContaInativaException("Conta inativa");
        }

        if (saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }

        saldo -= valor;
        destino.depositar(valor);
    }

    public static class ContaInativaException extends RuntimeException {
        public ContaInativaException(String mensagem) {
            super(mensagem);
        }
    }

    public static class SaldoInsuficienteException extends RuntimeException {
        public SaldoInsuficienteException(String mensagem) {
            super(mensagem);
        }
    }
}
