public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();

        cachorro1.nome = "Rex";
        cachorro1.idade = 3;
        cachorro1.raca = "Poodle";
        cachorro1.sexo = 'M';

        cachorro2.nome = "Tob";
        cachorro2.idade = 5;
        cachorro2.raca = "Vira-lata";
        cachorro2.sexo = 'M';

        System.out.println("Nome: " + cachorro1.nome);
        System.out.println("Idade: " + cachorro1.idade);
        System.out.println("Raça: " + cachorro1.raca);
        System.out.println("Sexo: " + cachorro1.sexo);

        System.out.println("Nome: " + cachorro2.nome);
        System.out.println("Idade: " + cachorro2.idade);
        System.out.println("Raça: " + cachorro2.raca);
        System.out.println("Sexo: " + cachorro2.sexo);
    }
}