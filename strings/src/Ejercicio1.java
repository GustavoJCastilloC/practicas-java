import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var arrayNombres = crearData();
        mostrarArray(arrayNombres);
        ordenarArray(arrayNombres);
        mostrarArray(arrayNombres);
    }

    static String[] crearData() {
        return new String[]{"Carlos", "Rodrigo", "Juan", "Arturo", "Daniel", "Mayra"};
    }

    static void ordenarArray(String[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) { //pasos
            for (var j = 0; j < n - i - 1; j++) {//subpasos
                //preguntamos si el actual es mayor alfabéticamente que el siguiente
                if (array[j].compareTo(array[j + 1]) >= 0) { //condición de desordenado
                    final var temp = array[j + 1];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static void mostrarArray(String[] array) {
        System.out.printf("El array es: %s%n", Arrays.toString(array));
    }
}
