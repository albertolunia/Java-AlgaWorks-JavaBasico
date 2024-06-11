import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();
        
        boolean bissexto = false;

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            bissexto = true;
        }

        if (bissexto) {
            System.out.println("O ano é bissexto");
        }
        else {
            System.out.println("O ano não é bissexto");
        }
    }
}