import java.util.Scanner;

public class CalcularPagamento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        float valorHora, valorDescontos, total;
        int horasTrabalhadas;

        System.out.print("Digite o nome do funcionário: ");
        nome = scanner.nextLine();

        System.out.print("Digite o valor da hora trabalhada: ");
        valorHora = scanner.nextFloat();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor dos descontos: ");
        valorDescontos = scanner.nextFloat();

        total = (horasTrabalhadas * valorHora) - valorDescontos;

        System.out.printf("\nFolha de pagamento: %s\r\n" + //
                        "%d horas x R$%.2f = R$%.2f\r\n" + //
                        "Descontos: R$%.2f\r\n" + //
                        "Total devido: R$%.2f", nome, horasTrabalhadas, valorHora, horasTrabalhadas * valorHora, valorDescontos, total);
    }    
}
