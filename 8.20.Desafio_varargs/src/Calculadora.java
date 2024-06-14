public class Calculadora {
    public static double media(double valor1, double valor2, double... valorN) {
        double soma = valor1 + valor2;
        for (double v : valorN) {
            soma += v;
        }
        return soma / (2 + valorN.length);
    }
}
