public class Holerite {

    Funcionario funcionario;
    double valorTotalHoraNormal;
    double valorTotalHoraExtra;
    double valorTotalAdicionalFilhos;

    public double CalcularValorTotal() {
        double salario = valorTotalHoraNormal + valorTotalHoraExtra;
        if (funcionario.PossuiFilhos()) {
            return salario * valorTotalAdicionalFilhos;
        } else {
            return salario;
        }
    }

    public void Imprimir(){
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Salário: " + CalcularValorTotal());
    }
}
