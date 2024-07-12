public class Main {
    public static void main(String[] args) {
        var endereco1 = new Endereco("Rua 1", "123", "Bairro 1");
        var endereco2 = new Endereco("Rua 2", "456", "Bairro 2", new Cidade("Cidade"));
        var endereco3 = new Endereco("Rua 3", "789", "Bairro 3", new Cidade("Cidade"));
        endereco3.setResidenciaPropria(true);

        var cliente1 = new Cliente("Cliente 1");
        var cliente2 = new Cliente("Cliente 2", endereco1);
        var cliente3 = new Cliente("Cliente 3", endereco2);
        var cliente4 = new Cliente("Cliente 4", endereco3);

        System.out.println(obterNomeCidadeResidenciaPropria(cliente1));
        System.out.println(obterNomeCidadeResidenciaPropria(cliente2));
        System.out.println(obterNomeCidadeResidenciaPropria(cliente3));
        System.out.println(obterNomeCidadeResidenciaPropria(cliente4));
    }

    public static String obterNomeCidadeResidenciaPropria(Cliente cliente) {
        return cliente.getEndereco()
            .flatMap(Endereco::getCidade)
            .filter(cidade -> cliente.getEndereco().map(Endereco::isResidenciaPropria).orElse(false))
            .map(Cidade::nome)
            .orElse("Cidade não encontrada");
    }


}