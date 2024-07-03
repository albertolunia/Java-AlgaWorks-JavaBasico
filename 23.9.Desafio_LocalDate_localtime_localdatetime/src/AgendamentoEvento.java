import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class AgendamentoEvento {

    public static boolean verificarDataDoEvento(String dataEvento) {
        LocalDate data = LocalDate.parse(dataEvento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        if (data.isBefore(LocalDate.now())) {
            System.out.println("Data inválida! A data do evento não pode ser anterior a data atual.");
            return false;
        }
        return true;
    }

    public static boolean verificarHorarioDoEvento(String horarioEvento) {
        if (horarioEvento.length() != 5) {
            System.out.println("Horário inválido! O horário deve ter 5 caracteres.");
            return false;
        }

        int hora = Integer.parseInt(horarioEvento.substring(0, 2));
        int minuto = Integer.parseInt(horarioEvento.substring(3, 5));

        if (hora < 0 || hora > 23) {
            System.out.println("Horário inválido! A hora deve estar entre 00 e 23.");
            return false;
        }

        if (minuto < 0 || minuto > 59) {
            System.out.println("Horário inválido! O minuto deve estar entre 00 e 59.");
            return false;
        }

        return true;
    }
}
