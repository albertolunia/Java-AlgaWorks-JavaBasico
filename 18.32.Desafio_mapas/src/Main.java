import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Estado mg = new Estado("MG", "Minas Gerais");
        Estado sp = new Estado("SP", "São Paulo");
        Estado rj = new Estado("RJ", "Rio de Janeiro");
        Estado es = new Estado("ES", "Espírito Santo");

        Cidade cidade1 = new Cidade(1, "Belo Horizonte", 2385639);
        Cidade cidade2 = new Cidade(2, "São Paulo", 12106920);
        Cidade cidade3 = new Cidade(3, "Rio de Janeiro", 6747815);
        Cidade cidade4 = new Cidade(4, "Vitória", 365855);

        //Map<Estado, Cidade> capitais = new HashMap<>();

        //Map<Estado, Cidade> capitais = new LinkedHashMap<>();

        Map<Estado, Cidade> capitais = new TreeMap<>();

        capitais.put(mg, cidade1);
        capitais.put(sp, cidade2);
        capitais.put(rj, cidade3);
        capitais.put(es, cidade4);

        for(Estado estado : capitais.keySet()) {
            System.out.println("Estado: " + estado.getNome() + " - " + estado.getSigla());
            System.out.println("Capital: " + capitais.get(estado).getNome());
            System.out.println("Total de habitantes: " + capitais.get(estado).getTotalHabitantes());
            System.out.println();
        }
    }
}