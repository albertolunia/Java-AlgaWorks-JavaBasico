import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float numero, soma = 0;
        
        for (int i = 0; i < 10;){
            System.out.println("Digite um número: ");
            numero = sc.nextFloat();

            if (numero % 2 == 0){
                soma += numero;
                i++;
            }            
        }

        System.out.println("A soma dos números é: " + soma);

        sc.close();
    }
}
