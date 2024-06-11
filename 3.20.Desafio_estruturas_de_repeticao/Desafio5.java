import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, soma = 0, x;
        do {
            System.out.println("Digite um número: ");
            numero = sc.nextInt();

            soma += numero;
            System.out.println("Deseja continuar? (1 - Sim / 0 - Não)");
            x = sc.nextInt();

        } while (x != 0);

        System.out.println("A soma dos números é: " + soma);

        sc.close();
    }
}
