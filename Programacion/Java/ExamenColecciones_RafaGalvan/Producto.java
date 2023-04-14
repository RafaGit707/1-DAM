package Java.ExamenColecciones_RafaGalvan;

public class Producto {
    
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private String categoria;

    public Producto(String nombre, String descripcion, double precio, String categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

}
