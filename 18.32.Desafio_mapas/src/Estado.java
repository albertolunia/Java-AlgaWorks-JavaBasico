import java.util.Objects;

public class Estado implements Comparable<Estado> {
    private String sigla;
    private String nome;

    public Estado(String sigla, String nome) {
        Objects.requireNonNull(sigla, "A sigla não pode ser nula");
        Objects.requireNonNull(nome, "O nome não pode ser nulo");
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "sigla='" + sigla + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Estado o) {
        return getSigla().compareTo(o.getSigla());
    }
}
