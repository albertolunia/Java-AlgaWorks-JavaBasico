import polimorfismo.classes.*;

public class Main {
    public static void main(String[] args) {
        var gestorImpostos = new GestorDeImpostos();

        var joao = new PessoaFisica("João", 45_00);
        var maria = new PessoaFisica("Maria", 180_000);

        var barDoze = new EmpresaSimples("Bar do Zé", 250_000, 160_000);
        var codeConsultoria = new EmpresaLucroReal("Code Consultoria", 8_000_000, 6_000_000);

        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);
        gestorImpostos.adicionar(barDoze);
        gestorImpostos.adicionar(codeConsultoria);

        System.out.println("Impostos totais: " + gestorImpostos.getValorTotalImpostos());
    }
}