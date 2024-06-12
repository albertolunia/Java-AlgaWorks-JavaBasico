public class Funcionario {
    String nome;
    int qtdFilhos;

    public boolean PossuiFilhos() {
        if (qtdFilhos > 0) {
            return true;
        } else {
            return false;
        }
    }
}
