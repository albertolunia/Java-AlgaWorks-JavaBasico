public class FolhaPagamento {

    public void calcularSalario(int horasNormais, int horasExtras, ContratoTrabalho contrato) {

        Holerite holerite = new Holerite();

        holerite.funcionario = contrato.funcionario;

        holerite.valorTotalHoraNormal = horasNormais * contrato.valorHoraNormal;
        holerite.valorTotalHoraExtra = horasExtras * contrato.valorHoraExtra;

        if (contrato.funcionario.PossuiFilhos()) {
            holerite.valorTotalAdicionalFilhos = 1.10;
        }

        holerite.Imprimir();
    }
}