public class Main {
    public static void main(String[] args) {
        String[] emailsValidos = {
                "joao@algaworks.com", "joao_silva@algaworks.com", "joao.silva@algaworks.com", "joao-silva@algaworks.com",
                "joao123@algaworks.com", "joao@algaworks123.com", "joao@java.algaworks.com", "joao@alga-works.com", "joao@email.me",
                "Joao@algaworks.com"
        };

        String[] emailsInvalidos = {
                ""," joao@algaworks","joao@algaworks.com ","joao @algaworks.com","joao@ algaworks.com","joao@algaworks. com",
                "joao@algaworks. com","joaoalgaworks.com","@algaworks.com", "joao@algaworks", "joao@algaworks.abcdef", "joao@alga@works.com",
                "joao@algaworks.co1", "joao@AlgaWorks.com", "joao@algaworks.Com", "joao.com@algaworks", "joao@.com", "joao@algaworks.",
                "jo#ao@algaworks.com", "joao@alga#works.com"
        };

        for(String email : emailsInvalidos) {
            if(ValidadorEmail.validar(email)) {
                throw new RuntimeException(String.format("Email inválido validado: %s", email));
            }
        }

        for(String email : emailsValidos) {
            if(!ValidadorEmail.validar(email)) {
                throw new RuntimeException(String.format("Email válido não validado: %s", email));
            }
        }

        System.out.println("Todos os testes passaram");
    }

}