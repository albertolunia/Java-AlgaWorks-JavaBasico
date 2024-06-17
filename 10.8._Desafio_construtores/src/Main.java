public class Main {
    public static void main(String[] args) {
        Participante p1 = new Participante("Ana");
        Participante p2 = new Participante("Carlos", 100);
        System.out.println(p1.nome + " " + p1.saldoDePontos); // Ana 0
        System.out.println(p2.nome + " " + p2.saldoDePontos); // Carlos 100
    }
}