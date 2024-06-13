public class NumeroUtil {
    public static void NumeroMaior(int a, int b) {
        if (a > b) {
            System.out.println("O número " + a + " é maior que o número " + b);
        } else {
            System.out.println("O número " + b + " é maior que o número " + a);
        }
    }

    public static void NumeroMaior(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("O número " + a + " é maior que os números " + b + " e " + c);
        } else if (b > a && b > c) {
            System.out.println("O número " + b + " é maior que os números " + a + " e " + c);
        } else {
            System.out.println("O número " + c + " é maior que os números " + a + " e " + b);
        }
    }

    public static void NumeroMaior(double a, double b) {
        if (a > b) {
            System.out.println("O número " + a + " é maior que o número " + b);
        } else {
            System.out.println("O número " + b + " é maior que o número " + a);
        }
    }

    public static void NumeroMaior(double a, double b, double c) {
        if (a > b && a > c) {
            System.out.println("O número " + a + " é maior que os números " + b + " e " + c);
        } else if (b > a && b > c) {
            System.out.println("O número " + b + " é maior que os números " + a + " e " + c);
        } else {
            System.out.println("O número " + c + " é maior que os números " + a + " e " + b);
        }
    }
}
