package polimorfismo.classes;

public class PessoaFisica extends Pessoa {
    public double RECEITA_ANUAL_ISENCAO = 50000;
    public double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    private double rendaAnual;

    public PessoaFisica(String nome, double rendaAnual){
        super(nome);
        this.rendaAnual = rendaAnual;
    }

    public double getReceitaAnual(){
        return rendaAnual;
    }

    @Override
    public double calcularImpostos() {
        if(rendaAnual <= RECEITA_ANUAL_ISENCAO){
            return 0;
        } else {
            return rendaAnual * ALIQUOTA_IMPOSTO_RENDA;
        }
    }
}
