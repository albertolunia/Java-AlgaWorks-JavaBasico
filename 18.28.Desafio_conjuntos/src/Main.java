import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Performance é mais importante
        //Set<Cidade> cidades = new HashSet<>();

        //Perfomance é imporante, mas precisa manter a ordem de iserção
        //Set<Cidade> cidades = new LinkedHashSet<>();

        //Perfomance não é importante, mas precisa manter a ordem natural dos elemtnos
        Set<Cidade> cidades = new TreeSet<>();

        cidades.add(new Cidade(6, "Florianópolis", 1000000));
        cidades.add(new Cidade(5, "Porto Alegre", 2500000));
        cidades.add(new Cidade(4, "Curitiba", 3000000));
        cidades.add(new Cidade(3, "Rio de Janeiro", 8000000));
        cidades.add(new Cidade(2, "Belo Horizonte", 5000000));
        cidades.add(new Cidade(1, "São Paulo", 12000000));

        for (Cidade cidade : cidades) {
            System.out.println(cidade);
        }
    }
}