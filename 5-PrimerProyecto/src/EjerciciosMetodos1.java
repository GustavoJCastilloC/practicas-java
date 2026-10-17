import java.util.Random;

public class EjerciciosMetodos1 {
    public static void main(String[] args) {
        final var random = new Random();

        final var masa = RamdomUtilities.generarRandomDouble(100, 300, random);
        final var aceleracion = RamdomUtilities.generarRandomDouble(3, 5, random);

        final var fuerza = calcularFuerza(masa, aceleracion);
        imprimitResultado(masa, aceleracion, fuerza);

    }

    static double calcularFuerza(double masa, double acelerracion) {
        return masa * acelerracion;
    }

    static void imprimitResultado(double masa, double aceleracion, double fuerza) {
        System.out.printf("Para una masa %.4f y aceleracion %.4f se tiene una fuerza de %.4f",
                masa, aceleracion, fuerza);
    }
}
