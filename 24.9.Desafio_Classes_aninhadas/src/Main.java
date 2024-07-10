import com.algaworks.vendas.Cliente;
import com.algaworks.vendas.ItemPedido;
import com.algaworks.vendas.Pedido;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    private final static NumberFormat FORMATADOR_MOEDA = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");
        Pedido pedido = new Pedido(cliente);

        ItemPedido item1 = pedido.adicionarItem("Iphone 14", 3, new BigDecimal("10000"));
        ItemPedido item2 = pedido.adicionarItem("Macbook Pro", 2, new BigDecimal("20000"));

        imprimirResumo(pedido);

        System.out.println("---");

        item1.setQuantidade(10);
        imprimirResumo(pedido);

        pedido.emitir();
        item1.setQuantidade(20);

    }

    private static void imprimirResumo(Pedido pedido){
        for(ItemPedido item: pedido.getItens()){
            System.out.println(item.getDescricao() + " - " + item.getQuantidade() + " un - " + FORMATADOR_MOEDA.format(item.getValorUnitario()) + " - " + FORMATADOR_MOEDA.format(item.getValorTotal()));
        }

        System.out.println("Total do pedido: " + FORMATADOR_MOEDA.format(pedido.getValorTotal()));
    }
}