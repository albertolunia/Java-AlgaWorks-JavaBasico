import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String dataNascimento;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Digite a data de nascimento no formato dd/mm/aaaa");
            dataNascimento = scanner.nextLine();

            if (dataNascimento.matches("\\d{2}/\\d{2}/\\d{4}")) {

                LocalDate nascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                LocalDate hoje = LocalDate.now();

                long anos = nascimento.until(hoje, ChronoUnit.YEARS);
                nascimento = nascimento.plusYears(anos);

                long meses = nascimento.until(hoje, ChronoUnit.MONTHS);
                nascimento = nascimento.plusMonths(meses);

                long dias = nascimento.until(hoje, ChronoUnit.DAYS);

                if(anos > 0){
                    if(anos == 1)
                        System.out.println("Você tem " + anos + " ano, " + meses + " meses e " + dias + " dias");
                    else
                        System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias");
                    break;
                }
                else if(meses > 0){
                    System.out.println("Você tem " + meses + " meses e " + dias + " dias");
                    break;
                }
                else if(dias > 0){
                    System.out.println("Você tem " + dias + " dias");
                }
                else{
                    System.out.println("Você nasceu hoje");
                    break;
                }

                break;
            }
            System.out.println("Data inválida");
        }
    }
}