import java.util.Random;

public class RandomUtilities {
    static int generarRandomInt(int min, int max, Random random) {
        return random.nextInt(max - min + 1) + min;
    }

    static double generarRandomDouble(double min, double max, Random random) {
        return (max - min) * random.nextDouble() + min;
    }

    static int[] generarRandomArrayInt(int cantidad, int min, int max, Random random) {
        int[] array = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            array[i] = generarRandomInt(min, max, random);
        }

        return array;
    }

    static double[] generarRandomArrayDouble(int cantidad, double min, double max, Random random) {
        double[] array = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            array[i] = generarRandomDouble(min, max, random);
        }

        return array;
    }
}
