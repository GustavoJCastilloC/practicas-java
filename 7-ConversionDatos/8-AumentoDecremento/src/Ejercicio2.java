import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        var numero = ScannerManager.leerInt(scanner, "Ingrese un numero");

        scanner.close();

        // decrementamos en 1
        numero--;

        System.out.printf("El numero es; %d%n", numero);

        final var n = RandomUtilities.generarRandomInt(3, 10, new Random());

        // Incrementamos en n
        numero -= n;

        System.out.printf("El numero es; %d%n", numero);
    }
}