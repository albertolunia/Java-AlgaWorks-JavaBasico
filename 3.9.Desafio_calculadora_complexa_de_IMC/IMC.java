import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o sexo (M para masculino e F para feminino): ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite o peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("IMC = %.2f\n", imc);

        if(sexo == 'M'){
            if(imc < 20.7){
                System.out.println("Abaixo do peso");
            }
            else if(imc < 26.4){
                System.out.println("No peso ideal");
            }
            else if(imc < 27.8){
                System.out.println("Um pouco acima do peso");
            }
            else if(imc < 31.1){
                System.out.println("Acima do peso ideal");
            }
            else{
                System.out.println("Obeso");
            }
        }
        else if(sexo == 'F'){
            if(imc < 19.1){
                System.out.println("Abaixo do peso");
            }
            else if(imc < 25.8){
                System.out.println("No peso ideal");
            }
            else if(imc < 27.3){
                System.out.println("Um pouco acima do peso");
            }
            else if(imc < 32.3){
                System.out.println("Acima do peso ideal");
            }
            else{
                System.out.println("Obeso");
            }
        }

        scanner.close();
    }    
}
