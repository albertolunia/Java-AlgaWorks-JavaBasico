import java.util.Calendar;

public class CalculadoraParcelas {
    public void calcularParcelas(String dataCompra, int quantidadeParcelas) {
        Calendar dataCompraCalendar = Calendar.getInstance();
        String[] dataCompraArray = dataCompra.split("/");
        int dia = Integer.parseInt(dataCompraArray[0]);
        int mes = Integer.parseInt(dataCompraArray[1]) - 1;
        int ano = Integer.parseInt(dataCompraArray[2]);

        dataCompraCalendar.set(ano, mes, dia);

        for (int i = 0; i < quantidadeParcelas; i++) {
            if (dataCompraCalendar.get(Calendar.MONTH) == Calendar.FEBRUARY && dia > 28) {
                int ultimoDiaDeFevereiro = dataCompraCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
                dataCompraCalendar.set(Calendar.DAY_OF_MONTH, ultimoDiaDeFevereiro);
            } else {
                dataCompraCalendar.set(Calendar.DAY_OF_MONTH, 30);
            }

            System.out.println("Parcela " + (i + 1) + ": " +
                dataCompraCalendar.get(Calendar.DAY_OF_MONTH) + "/" +
                (dataCompraCalendar.get(Calendar.MONTH) + 1) + "/" +
                dataCompraCalendar.get(Calendar.YEAR));

            dataCompraCalendar.add(Calendar.MONTH, 1);

            dataCompraCalendar.set(Calendar.DAY_OF_MONTH, 1);
        }
    }
}