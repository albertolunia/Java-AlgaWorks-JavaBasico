package polimorfismo.classes;

public class EmpresaLucroReal extends PessoaJuridica{
    public double ALIQUOTA_IMPOSTO_LUCRO = 0.25;

    public EmpresaLucroReal(String nome, double faturamentoAnual, double despesaAnual){
        super(nome, faturamentoAnual, despesaAnual);
    }

    @Override
    public double calcularImpostos() {
        return getLucroAnual() * ALIQUOTA_IMPOSTO_LUCRO;
    }
}
