import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class ExtrairNomesJson {
    public static void extrair(String json) {
        List<String> nomes = Arrays.stream(json.split("\n"))
                .filter(linha -> linha.contains("nome"))
                .map(linha -> linha.split(":")[1].replace("\"", "").trim())
                .toList();

        nomes.forEach(System.out::println);
    }
}
