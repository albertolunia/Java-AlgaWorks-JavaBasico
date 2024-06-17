public class Participante {
    String nome;
    int saldoDePontos;

    Participante(String nome){
        this.nome = nome;
        this.saldoDePontos = 0;
    }

    Participante(String nome, int saldoDePontos) {
        this.nome = nome;
        this.saldoDePontos = saldoDePontos;
    }
}
