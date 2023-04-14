package Java.ExamenColecciones_RafaGalvan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CarritoCompra {

    private ArrayList<Producto> productos;

    public CarritoCompra() {
        productos = new ArrayList<Producto>();
    }

    public boolean insertar(Producto producto) {
        return productos.add(producto);
    }

    public boolean eliminar(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                productos.remove(p);
                return true;
            }
        }
        return false;
    }

    public boolean contieneCategoria(String categoria) {
        for (Producto p : productos) {
            if (p.getCategoria().equals(categoria)) {
                return true;
            }
        }
        return false;
    }
    

    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio();
        }
        DescuentoPorCategoria descuentoPorCategoria = new DescuentoPorCategoria();
        double descuentoTotal = descuentoPorCategoria.calcularDescuento(productos);
        return precioTotal - descuentoTotal;
    }

    public void limpiarCarrito() {
        productos.clear();
    }

    public String mostrarPorCodigo() {
        StringBuilder sb = new StringBuilder();
        Collections.sort(productos, Comparator.comparingInt(Producto::getId));
        for (Producto p : productos) {
            sb.append(p.getId()).append(" - ").append(p.getNombre()).append("\n");
        }
        return sb.toString();
    }

    public String mostrarPorNombre() {
        StringBuilder sb = new StringBuilder();
        Collections.sort(productos, Comparator.comparing(Producto::getNombre));
        for (Producto p : productos) {
            sb.append(p.getNombre()).append(" - ").append(p.getId()).append("\n");
        }
        return sb.toString();
    }
}
