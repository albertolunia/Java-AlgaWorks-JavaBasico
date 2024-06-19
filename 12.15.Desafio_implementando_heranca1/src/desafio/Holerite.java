package desafio;

public record Holerite(String nome, String mesAno, double valorSalario) {
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Mês/Ano: " + mesAno);
        System.out.println("Salário: " + valorSalario);
    }
}
