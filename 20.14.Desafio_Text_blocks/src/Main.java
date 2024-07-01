public class Main {
    public static void main(String[] args) {
        String json = """
            {
                "id": 1,
                "nome": "João da Silva",
            }
            {
                "id": 2,
                "nome": "Maria Abadia",
            }
            {
                "id": 3,
                "nome": "Sebastião Carvalho",
            }
        """;

        System.out.println(json);

        ExtrairNomesJson.extrair(json);
    }
}