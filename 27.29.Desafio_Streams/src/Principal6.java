import com.algaworks.comercial.ServicoDeVenda;
import com.algaworks.comercial.Venda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Principal6 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        List<String> clientes = vendas.stream()
                .filter(Venda::isFechada)
                .map(venda -> venda.getCliente().nome())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(clientes);
    }

}