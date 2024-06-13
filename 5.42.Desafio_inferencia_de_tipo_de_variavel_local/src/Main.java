public class Main {
    public static void main(String[] args) {

        var folha = new FolhaPagamento();
        var funcionario = new Funcionario();
        funcionario.nome = "João";
        funcionario.qtdFilhos = 2;

        var contrato = new ContratoTrabalho();

        contrato.funcionario = funcionario;
        contrato.valorHoraNormal = 100;
        contrato.valorHoraExtra = 100;

        folha.calcularSalario(10, 2, contrato);
    }
}