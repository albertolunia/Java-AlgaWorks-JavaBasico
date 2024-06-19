package desafio;

public class Programador extends Funcionario {
    private double valorBonus;

    public Programador(String nome, double valorHora) {
        super(nome, valorHora);
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    public final double calcularSalario(int horasTrabalhadas) {
        return (horasTrabalhadas * super.getValorHora()) + valorBonus;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "valorBonus=" + valorBonus +
                "} " + super.toString();
    }

}
