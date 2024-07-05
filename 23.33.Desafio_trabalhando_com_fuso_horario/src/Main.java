import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data, hora;

        System.out.print("Data local da festa (dd/MM/yyyy):");
        data = scanner.nextLine();

        System.out.print("Horario local da festa (HH:mm): ");
        hora = scanner.nextLine();

        if (data.matches("\\d{2}/\\d{2}/\\d{4}") && hora.matches("\\d{2}:\\d{2}")) {
            LocalDateTime localDateTime = LocalDateTime.parse(data + " " + hora, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
            ZonedDateTime horaBrasilia = ZonedDateTime.of(localDateTime, ZoneId.of("America/Sao_Paulo"));
            ZonedDateTime horaPacifico = horaBrasilia.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
            ZonedDateTime horaToquio = horaBrasilia.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

            System.out.println("Festa na sua casa as " + formatter.format(horaBrasilia) + " no horário de Brasília");
            System.out.println("Festa na sua casa as " + formatter.format(horaPacifico) + " no horário de Verão do Pacífico");
            System.out.println("Festa na sua casa as " + formatter.format(horaToquio) + " no horário de Tóquio");
        } else {
            System.out.println("Data ou horário inválido");
        }
    }
}