import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, aux;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        int tamanho = String.valueOf(numero).length();
        
        for(int i = 0; i < tamanho; i++){
            aux = numero % 10;
            numero = numero / 10;
            System.out.print(aux);
        }

        sc.close();
    }
}
