import java.util.Scanner;

public class Desafio3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero, soma = 0;

        while(soma < 100){
            System.out.println("Digite um número: ");
            numero = sc.nextInt();

            soma += numero;
                
        }

        System.out.println("A soma dos números é: " + soma);

        sc.close();
    }
}