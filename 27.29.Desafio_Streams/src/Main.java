import com.algaworks.comercial.ServicoDeVenda;
import com.algaworks.comercial.Venda;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        System.out.println("Vendas fechadas:");
        vendas.stream()
                .filter(Venda::isFechada)
                .forEach(System.out::println);
    }
}