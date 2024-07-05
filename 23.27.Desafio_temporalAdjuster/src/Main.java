import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ano, mes;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ano: ");

        ano = scanner.nextInt();

        Year year = Year.of(ano);

        System.out.print("Mês: ");

        mes = scanner.nextInt();

        Month month = Month.of(mes);


        LocalDate data = LocalDate.of(ano, mes, 1);

        System.out.printf("Gerando agenda anual de reuniões desde %s de %s...\n", month.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("pt-BR")), year);
        while (data.getYear() == ano) {
            LocalDate primeiraSegunda = data.with(TemporalAdjusters.firstInMonth(java.time.DayOfWeek.MONDAY));
            String dataFormatada = primeiraSegunda.format(DateTimeFormatter.ofPattern("EEEE', dia' d 'de' MMMM 'de' yyyy"));
            System.out.println(dataFormatada);

            data = data.plusMonths(1).withDayOfMonth(1);
        }
    }
}