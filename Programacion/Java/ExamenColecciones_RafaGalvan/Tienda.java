package Java.ExamenColecciones_RafaGalvan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tienda implements Tienda_I {
    
    private HashMap<Integer, Producto> productos;
    private DescuentoPorCategoria descuentos;
    private CarritoCompra carrito;
    
    public Tienda() {
        productos = new HashMap<Integer, Producto>();
        descuentos = new DescuentoPorCategoria();
        carrito = new CarritoCompra();
    }
    
    public boolean insertarProducto(Producto producto) {
        if (productos.containsKey(producto.getId())) {
            return false; // el producto ya existe
        }
        productos.put(producto.getId(), producto);
        return true;
    }
    
    public String mostrarProductosPorNombre() {
        List<Producto> listaProductos = new ArrayList<Producto>(productos.values());
        listaProductos.sort(new ComparadorProductosPorNombre());
        StringBuilder sb = new StringBuilder();
        for (Producto p : listaProductos) {
            sb.append(p.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public String mostrarProductosPorId() {
        List<Producto> listaProductos = new ArrayList<Producto>(productos.values());
        listaProductos.sort(new ComparadorProductosPorId());
        StringBuilder sb = new StringBuilder();
        for (Producto p : listaProductos) {
            sb.append(p.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public Producto buscarProducto(int id) {
        return productos.get(id);
    }
    
    public double obtenerCuentaTotal() {
        double total = carrito.calcularTotal();
        double descuentoHogar = descuentos.obtener("Hogar");
        double descuentoElectronica = descuentos.obtener("Electronica");
        double descuentoTotal = 0;
        if (carrito.contieneCategoria("Hogar")) {
            descuentoTotal += total * descuentoHogar;
        }
        if (carrito.contieneCategoria("Electronica")) {
            descuentoTotal += total * descuentoElectronica;
        }
        return total - descuentoTotal;
    }
    
    public void setDescuentoHogar(double descuento) {
        descuentos.insertar("Hogar", descuento);
    }
    
    public void setDescuentoElectronica(double descuento) {
        descuentos.insertar("Electronica", descuento);
    }
    
    public void insertarProductoEnCarrito(Producto producto) {
        carrito.insertar(producto);
    }
    
    public void eliminarProductoDelCarrito(int id) {
        carrito.eliminar(id);
    }
    
    public void limpiarCarrito() {
        carrito.limpiarCarrito();
    }
    
    public String mostrarProductosEnCarritoPorCodigo() {
        return carrito.mostrarPorCodigo();
    }
    
    public String mostrarProductosEnCarritoPorNombre() {
        return carrito.mostrarPorNombre();
    }
    
}

