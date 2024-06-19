import desafio.*;

public class Main {
    public static void main(String[] args) {
        Programador programador = new Programador("João", 100);
        programador.setValorBonus(500);
        Holerite holerite = programador.gerarHolerite(10, "07/2021");
        holerite.imprimir();

        System.out.println(programador.toString());
    }
}