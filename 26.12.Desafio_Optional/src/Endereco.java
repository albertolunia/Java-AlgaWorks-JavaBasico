import java.util.Optional;

public class Endereco {

    private final String logradouro;
    private final String numero;
    private final String bairro;
    private Cidade cidade;
    private boolean residenciaPropria = false;

    public Endereco(String logradouro, String numero, String bairro) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
    }

    public Endereco(String bairro, String numero, String logradouro, Cidade cidade) {
        this.bairro = bairro;
        this.numero = numero;
        this.logradouro = logradouro;
        this.cidade = cidade;
    }

    public boolean isResidenciaPropria() {
        return residenciaPropria;
    }

    public void setResidenciaPropria(boolean residenciaPropria) {
        this.residenciaPropria = residenciaPropria;
    }

    public Optional<Cidade> getCidade() {
        return Optional.ofNullable(cidade);
    }
}
