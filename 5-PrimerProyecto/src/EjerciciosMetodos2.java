import java.util.Random;

public class EjerciciosMetodos2 {
    public static void main(String[] args) {
        final var random = new Random();

        final var velocidadInicial = RamdomUtilities.generarRandomDouble(10, 30, random);
        final var aceleracion = RamdomUtilities.generarRandomDouble(2, 5, random);
        final var tiempo = RamdomUtilities.generarRamdomInt(3, 5, random);

        final var velocidadFinal = calcularVelocidadFinal(velocidadInicial, aceleracion, tiempo);
        imprimirResultado(velocidadInicial, aceleracion, tiempo, velocidadFinal);

    }

    static double calcularVelocidadFinal(double velocidadInicial, double aceleracion, int tiempo) {
        return velocidadInicial + aceleracion * tiempo;
    }

    static void imprimirResultado(double velocidadInicial, double aceleracion, int tiempo,
                                  double velocidadFinal) {
        System.out.printf("Para una velocidad inicial %.3f, una aceleracion %.3f y un tiempo %d " +
                        "tenemos una velocidad final %.3f usando MRUV",
                velocidadInicial, aceleracion, tiempo, velocidadFinal);
    }
}
