package com.algaworks.agencia;

import java.util.Objects;

public class PacoteViagem implements Comparable<PacoteViagem>{
    private String descricao;
    private double precoPorPessoa;

    public PacoteViagem(String descricao, double precoPorPessoa) {
        Objects.requireNonNull(descricao);

        if(precoPorPessoa < 0) {
            throw new IllegalArgumentException("Preço por pessoa não pode ser negativo.");
        }

        this.descricao = descricao;
        this.precoPorPessoa = precoPorPessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoPorPessoa() {
        return precoPorPessoa;
    }

    public void setDescricao(String descricao) {
        Objects.requireNonNull(descricao);
        this.descricao = descricao;
    }

    public void setPrecoPorPessoa(double precoPorPessoa) {
        if(precoPorPessoa < 0) {
            throw new IllegalArgumentException("Preço por pessoa não pode ser negativo.");
        }
        this.precoPorPessoa = precoPorPessoa;
    }

    @Override
    public String toString() {
        return "PacoteViagem [descricao=" + descricao + ", precoPorPessoa=" + precoPorPessoa + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PacoteViagem that = (PacoteViagem) o;
        return Double.compare(precoPorPessoa, that.precoPorPessoa) == 0 && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, precoPorPessoa);
    }

    public int compareTo(PacoteViagem pacote) {
        if(this.getPrecoPorPessoa() < pacote.getPrecoPorPessoa()) {
            return -1;
        } else if(this.getPrecoPorPessoa() > pacote.getPrecoPorPessoa()) {
            return 1;
        }
        return 0;
    }
}
