import java.util.Random;

public class RamdomUtilities {
    static int generarRamdomInt(int min, int max, Random random) {
        return random.nextInt(max - min + 1) + min;
    }

    static double generarRandomDouble(int min, int max, Random random) {
        return (max - min) * random.nextDouble() + min;
    }


}
