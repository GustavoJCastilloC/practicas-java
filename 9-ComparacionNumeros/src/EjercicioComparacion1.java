import java.util.Random;

public class EjercicioComparacion1 {
    public static void main(String[] args) {
        final var random = new Random();

        final var a = RandomUtilities.generarRandomInt(20, 100, random);
        final var b = RandomUtilities.generarRandomInt(20, 100, random);

        final var aEsNegativo = esNegativo(a); //boolean

        imprimirResultado(a, aEsNegativo);

        final var bEsNegativo = esNegativo(b);

        imprimirResultado(b, bEsNegativo);

    }

    static boolean esNegativo(int numero) {
        return numero < 0;
    }

    static void imprimirResultado(int numero, boolean esNegativo) {
        System.out.printf("El numero %d es negativo? %b%n", numero, esNegativo);
    }
}
