public class NotaFiscal {

    private final Integer numero;
    private final String descricao;
    private final double valor;
    private Status status = Status.NAO_EMITIDA;

    public NotaFiscal(Integer numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public Status getStatus() {
        return status;
    }

    public void cancelar(){
        if ((status == Status.EMITIDA && getValor() >= 1_000) || status == Status.CANCELADA) {
            throw new IllegalStateException("Nota fiscal não pode ser cancelada");
        }
        status = Status.CANCELADA;
    }

    public void emitir(){
        if (status == Status.CANCELADA || status == Status.EMITIDA) {
            throw new IllegalStateException("Nota fiscal não pode ser emitida");
        }
        status = Status.EMITIDA;
    }

    public String getDescricaoCompleta(){
        return "Nota fiscal número: " + getNumero() + ", descrição: " + getDescricao() + ", valor: " + getValor() + ", status: " + getStatus();
    }
}
