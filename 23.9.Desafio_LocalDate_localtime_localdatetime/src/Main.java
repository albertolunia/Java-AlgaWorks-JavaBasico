import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatador = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
                .withLocale(java.util.Locale.getDefault());

        while (true) {
            System.out.println("Data do evento: ");
            String data = scanner.nextLine();

            if (AgendamentoEvento.verificarDataDoEvento(data)) {
                System.out.println("Horário do evento: ");
                String horario = scanner.nextLine();

                if (AgendamentoEvento.verificarHorarioDoEvento(horario)) {
                    LocalDateTime dataHora = LocalDateTime.parse(data + " " + horario, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
                    System.out.println("Evento agendado para " + dataHora.format(formatador));
                    break;
                }
            }
        }

        scanner.close();
    }
}