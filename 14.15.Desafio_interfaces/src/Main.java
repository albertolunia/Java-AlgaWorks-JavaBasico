import com.classes.Caminhao;
import com.classes.CarroParticular;
import com.classes.ImovelResidencial;
import com.classes.ServicoPropostaSeguro;

public class Main {
    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        CarroParticular carro = new CarroParticular(2022, 150_000, "HR-V");
        Caminhao caminhao = new Caminhao("Actros", 780_000, 2021, 4);
        ImovelResidencial imovelResidencial = new ImovelResidencial(2_300_000,320);

        servicoPropostaSeguro.emitir(carro);
        servicoPropostaSeguro.emitir(caminhao);
        servicoPropostaSeguro.emitir(imovelResidencial);
    }
}