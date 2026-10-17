import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad:");
        final var edad = ScannerManager.leerInt(scanner, "Ingrese su edad");

        System.out.print("Ingrese su estatura: ");
        final var estatura = ScannerManager.leerDouble(scanner, "Ingrese su estatura");

        scanner.nextLine();

        System.out.print("Ingrese su nombre: ");
        final var nombre = ScannerManager.leerString(scanner, "Ingrese su nombre");

        scanner.close();

        imprimirResultado(nombre, edad, estatura);
    }

    static void imprimirResultado(String nombre, int edad, double estatura) {
        System.out.printf("Mi nombre es %s, tengo %d y mido %.2fcm%n", nombre, edad, estatura);
    }


}
