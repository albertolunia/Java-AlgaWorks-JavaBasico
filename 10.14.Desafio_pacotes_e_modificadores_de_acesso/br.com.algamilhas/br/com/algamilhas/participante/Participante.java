package br.com.algamilhas.participante;

public class Participante {
    private String nome;
    private int saldoDePontos;

    public Participante(String nome){
        this.nome = nome;
        this.saldoDePontos = 0;
    }

    private Participante(String nome, int saldoDePontos) {
        this.nome = nome;
        this.saldoDePontos = saldoDePontos;
    }

    public void creditarPontos(int pontos){
        this.saldoDePontos += pontos;
    }

    public void imprimir(){
        System.out.println(this.nome + "| Pontos: " + this.saldoDePontos);
    }
}
