import br.com.algamilhas.participante.Participante;

public class Main {
    public static void main(String[] args) {
        Participante p1 = new Participante("Alberto");
        p1.creditarPontos(10);

        p1.imprimir();

        p1.creditarPontos(30);

        p1.imprimir();

    }
}