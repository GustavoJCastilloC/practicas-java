import java.util.Random;

public class EjercicioRamdom {
    public static void main(String[] args) {
        final var random = new Random();

        final var randomInt = RamdomUtilities.generarRamdomInt(20, 100, random);
        final var randomDouble = RamdomUtilities.generarRandomDouble(100, 500, random);

        System.out.printf("Random int: %d%n", randomInt);
        System.out.printf("Random double: %.2f%n", randomDouble);
    }
}
