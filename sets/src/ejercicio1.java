import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ejercicio1 {
    public static void main(String[] args) {
        final var set1 = crearSetGrupo1();

        final var scanner = new Scanner(System.in);
        final var set2 = crearSetGrupo2(scanner);
        scanner.close();

        set1.addAll(set2); //juntamos ambos sets y lo guardamos en set1
        
        imprimirSet(set1);
    }

    static Set<String> crearSetGrupo1() {
        return new HashSet<>(Arrays.asList("oso", "carro", "patito", "robot", "pelota"));
    }

    static Set<String> crearSetGrupo2(Scanner scanner) {
        final var set = new HashSet<String>();

        String regalo; //iterador}
        do {
            regalo = ScannerManager.leerString(scanner, "Ingrese su regalo");
            if (!regalo.equals("salida")) { //si no es salida
                set.add(regalo);
            }
        } while (!regalo.equals("salida")); //mientra no sea salida

        return set;
    }

    static void imprimirSet(Set<String> set) {
        System.out.printf("El registro total es: %s%n", set);
    }
}
