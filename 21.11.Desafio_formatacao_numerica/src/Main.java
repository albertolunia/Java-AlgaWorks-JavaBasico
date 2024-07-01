import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Preço do produto em Dólares:");
        double precoDolar = scanner.nextDouble();


        System.out.println("Cotação do Dólar:");
        double cotacaoDolar = scanner.useLocale(Locale.getDefault()).nextDouble();

        double precoReal = precoDolar * cotacaoDolar;
        System.out.printf("Preço do produto em Reais: R$ %.2f", precoReal);
    }
}