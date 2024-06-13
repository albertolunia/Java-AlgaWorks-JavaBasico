public class Cardapio {

    ItemCardapio[] itens;

    void adicionarItem(ItemCardapio item) {
        if (itens == null) {
            itens = new ItemCardapio[1];
            itens[0] = item;
        } else {
            ItemCardapio[] novoArray = new ItemCardapio[itens.length + 1];
            System.arraycopy(itens, 0, novoArray, 0, itens.length);
            novoArray[novoArray.length - 1] = item;
            itens = novoArray;
        }
    }

    void removerItem(int indice) {
        if (indice < 0 || indice >= itens.length) {
            System.out.println("Índice inválido");
        } else {
            ItemCardapio[] novoArray = new ItemCardapio[itens.length - 1];
            System.arraycopy(itens, 0, novoArray, 0, indice);
            System.arraycopy(itens, indice + 1, novoArray, indice, novoArray.length - indice);
            itens = novoArray;
        }
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio iten : itens) {
            if (iten.preco >= precoMinimo && iten.preco <= precoMaximo) {
                System.out.println(iten.descricao + " - R$ " + iten.preco);
            }
        }
    }

}