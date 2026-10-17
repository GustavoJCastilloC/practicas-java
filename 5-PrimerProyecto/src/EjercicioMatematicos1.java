public class EjercicioMatematicos1 {
    public static void main(String[] args) {
        final var velocidadInicial = 15.24;
        final var aceleracion = 3.75;
        final var tiempo = 5;
        final var velocidadFinal = velocidadInicial + aceleracion * tiempo; //MRUV

        System.out.printf("Para una velocidad inicial %.3f, una aceleración %.3f y un tiempo %d." +
                        "Se tiene una velocidad final %.3f usando MRUV.%n",
                velocidadInicial, /* primer %.3f*/
                aceleracion, /* segundo %.3f*/
                tiempo, /* %d*/
                velocidadFinal); /* tercero %.3f*/
        /* %n = salto de lìnea*/
    }
}
