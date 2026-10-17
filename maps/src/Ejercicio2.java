import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var mapJuguetes = crearMap();

        final var scanner = new Scanner(System.in);
        final var precioTotal = calcularPrecio(mapJuguetes, scanner);
        scanner.close();

        imprimirPrecioTotal(precioTotal);
    }

    static Map<String, Double> crearMap() {
        return Map.of(
                "Robot", 15.21,
                "Pelota", 23.12,
                "Carro", 11.68,
                "Oso", 5.84,
                "Baraja", 9.99,
                "Bateria", 43.12
        );
    }

    static void imprimirMap(Map<String, Double> map) {
        System.out.printf("Los productos y sus precios son; %s%n", map);
    }

    static double calcularPrecio(Map<String, Double> mapJuguetes, Scanner scanner) {
        var precioTotal = 0.0; //aqui acumularemos el precio

        String jugueteLeido; //Iterador

        do {
            imprimirMap(mapJuguetes);
            jugueteLeido = ScannerManager.leerString(scanner, "Ingrese el juguete a comprar");
            if (!jugueteLeido.equals("salida")) {//si no es salida
                if (mapJuguetes.containsKey(jugueteLeido)) { //si exite el juguete
                    precioTotal += mapJuguetes.get(jugueteLeido); //acumula a la suma
                } else {
                    System.out.println("Juguete inválido");
                }
            }
        } while (!jugueteLeido.equals("salida")); //condicion de continuación

        return precioTotal;
    }

    static void imprimirPrecioTotal(double precioTotal) {
        System.out.printf("El precio total es %.2f%n", precioTotal);
    }
}
