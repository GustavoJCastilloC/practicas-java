public class EjercicioMatematicos2 {
    public static void main(String[] args) {
        final var aceleracion = 100.5032;
        final var masa = 76.1265;
        final var fuerza = masa * aceleracion; //2da Ley de Newton

        System.out.printf("Para una masa de %.4f y aceleración de %.4f tenemos una fuerza de %.4f.%n",
                masa,
                aceleracion,
                fuerza);
    }
}
