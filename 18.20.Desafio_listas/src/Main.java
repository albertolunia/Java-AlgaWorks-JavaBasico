import com.algaworks.agencia.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CadastroPacoteViagem cadastro = new CadastroPacoteViagem();
        cadastro.adicionar("Pacote 1", 1000);
        cadastro.adicionar("Pacote 2", 2000);
        cadastro.adicionar("Pacote 3", 3000);
        cadastro.adicionar("Pacote 4", 4000);

        cadastro.removerPorDescricao("Pacote 2");

        cadastro.ordenar();
        cadastro.ordenarPorPrecoDecrescente();

        PacoteViagem pacoteEncontrado = cadastro.buscarPorDescricao("Pacote 3");
        System.out.println(pacoteEncontrado);

        imprimirPacotes(cadastro.obterTodos());
    }

    private static void imprimirPacotes(List<PacoteViagem> pacotes) {
        for (PacoteViagem pacote : pacotes) {
            System.out.println(pacote);
        }
    }
}