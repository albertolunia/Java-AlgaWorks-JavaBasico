public class CalculadoraGeometrica {
    public static float calcularAreaQuadrado(float lado){
        return lado * lado;
    }

    public static float calcularAreaCirculo(final float raio){
        //raio = 3; // Error: cannot assign a value to final variable 'raio'
        return (float) (Math.PI * Math.pow(raio, 2));
    }
}
