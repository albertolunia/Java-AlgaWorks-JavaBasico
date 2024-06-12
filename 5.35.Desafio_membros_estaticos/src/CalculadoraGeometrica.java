public class CalculadoraGeometrica {
    public static float calcularAreaQuadrado(float lado){
        return lado * lado;
    }

    public static float calcularAreaCirculo(float raio){
        return (float) (Math.PI * Math.pow(raio, 2));
    }
}
