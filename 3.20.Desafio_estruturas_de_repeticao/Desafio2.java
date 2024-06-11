import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if (numero == 1){
            System.out.println("O número 1 não é primo.");
        } else {
            int contador = 0;
            for (int i = 2; i < numero; i++){
                if (numero % i == 0){
                    contador++;
                }
            }

            if (contador == 0){
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }
    }
}
