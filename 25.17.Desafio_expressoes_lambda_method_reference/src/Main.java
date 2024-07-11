import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("João", new BigDecimal(19000), true));
        funcionarios.add(new Funcionario("Maria", new BigDecimal(5000), true));
        funcionarios.add(new Funcionario("Manoel", new BigDecimal(10000), false));
        funcionarios.add(new Funcionario("Sebastião", new BigDecimal(2000), true));

        //funcionarios.removeIf(funcionario -> funcionario.isInativo());
        funcionarios.removeIf(Funcionario::isInativo);

        //funcionarios.sort((funcionario1, funcionario2) -> funcionario1.getSalario().compareTo(funcionario2.getSalario()));
        funcionarios.sort(Comparator.comparing(Funcionario::getSalario));

        //funcionarios.forEach(funcionario -> imprimir(funcionario));
        funcionarios.forEach(Main::imprimir);
    }

    private static void imprimir(Funcionario funcionario) {
    System.out.printf("Nome: %s, Salário: %s, Imposto de 20%% em cima do salario: %s\n",
        funcionario.getNome(),
        funcionario.getSalario().toString(),
        funcionario.getSalario().multiply(new BigDecimal("0.2")));
}
}