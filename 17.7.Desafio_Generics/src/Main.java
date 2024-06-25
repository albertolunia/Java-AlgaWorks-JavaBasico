import com.algaworks.estoque.*;

public class Main {
    public static void main(String[] args) {
        GerenciadorEstoque<Roupa> estoqueRoupas = new GerenciadorEstoque<>();
        //estoqueRoupas.adicionar(new Carro ("BMW X1", 4));
        estoqueRoupas.adicionar(new Roupa ("Camisa Polo", 20));
        estoqueRoupas.adicionar(new Roupa ("Calça Jeans", 10));
        imprimirEstoque(estoqueRoupas);

        GerenciadorEstoque<Carro> estoqueCarros = new GerenciadorEstoque<>();
        estoqueCarros.adicionar(new Carro ("BMW X1", 4));
        estoqueCarros.adicionar(new Carro ("BMW X5", 8));
        imprimirEstoque(estoqueCarros);
    }
    private static void imprimirEstoque(GerenciadorEstoque<?> estoque) {
            System.out.println("Estoque: " + estoque.getQuantidadeTotal());
    }
}