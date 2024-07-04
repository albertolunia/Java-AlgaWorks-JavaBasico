import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class CalculadoraParcelas {
    public static void calcularParcelas(String parcelas, int quantidadeParcelas) {
        LocalDate data = LocalDate.parse(parcelas, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int diaOriginal = data.getDayOfMonth();

        for (int i = 0; i < quantidadeParcelas; i++) {
            // Verifica se o mês atual tem o dia original, se não, ajusta para o último dia do mês
            if (data.lengthOfMonth() < diaOriginal) {
                data = data.with(TemporalAdjusters.lastDayOfMonth());
            }
            System.out.println(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            // Incrementa o mês
            data = data.plusMonths(1);
            // Tenta redefinir o dia para o dia original, se possível
            if (data.lengthOfMonth() >= diaOriginal) {
                data = data.withDayOfMonth(diaOriginal);
            }
        }
    }
}