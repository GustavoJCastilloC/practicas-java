import java.util.Random;

public class EjercicioMatematicos4 {
    public static void main(String[] args) {
        final var min = 20;
        final var max = 100;
        final var ramdom = new Random();

        final var radio = ramdom.nextInt(max - min + 1) + min;

        final var area = Math.PI * Math.pow(radio, 2);
        final var perimetro = 2 * Math.PI * radio;

        System.out.printf("Para un radio %d se tiene un perimetro %.3f y un area de %.3f%n",
                radio, perimetro, area);
    }
}

