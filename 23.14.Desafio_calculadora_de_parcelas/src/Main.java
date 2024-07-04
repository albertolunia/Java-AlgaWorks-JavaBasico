import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parcelas;
        int quantidadeParcelas;

        System.out.println("Calculadora de parcelas");
        System.out.println("Data da primeira parcela: ");
        parcelas = scanner.nextLine();

        System.out.println("Quantidade de parcelas: ");
        quantidadeParcelas = scanner.nextInt();

        CalculadoraParcelas.calcularParcelas(parcelas, quantidadeParcelas);
    }
}