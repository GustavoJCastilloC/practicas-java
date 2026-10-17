package ejercicio1;

public class Producto {
    private final String nombre;
    private final double precio;
    private final int stock;
    private final double peso;
    private final boolean percible;
    private final double volumen;

    public Producto(String nombre, double precio, int stock, boolean percible, double volumen, double peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.percible = percible;
        this.volumen = volumen;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
}
