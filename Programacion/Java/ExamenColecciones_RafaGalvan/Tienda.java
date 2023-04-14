package Java.ExamenColecciones_RafaGalvan;

import java.util.ArrayList;

public class Tienda implements Tienda_I {

    private ArrayList<Producto> productos;
    private DescuentoPorCategoria descuentos;
    private CarritoCompra carrito;

    public Tienda() {
        productos = new ArrayList<>();
        descuentos = new DescuentoPorCategoria();
        carrito = new CarritoCompra();
    }

    public boolean insertarProducto(Producto producto) {
        if (buscarProducto(producto.getId()) != null) {
            return false; // ya existe un producto con ese id
        }
        productos.add(producto);
        return true;
    }

    public String mostrarProductosPorNombre() {
        ArrayList<Producto> productosOrdenados = new ArrayList<>(productos);
        productosOrdenados.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        return productosOrdenados.toString();
    }

    public String mostrarProductosPorId() {
        ArrayList<Producto> productosOrdenados = new ArrayList<>(productos);
        productosOrdenados.sort((p1, p2) -> Integer.compare(p1.getId(), p2.getId()));
        return productosOrdenados.toString();
    }

    public Producto buscarProducto(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null; // no se encontró el producto
    }

    public double obtenerCuentaTotal() {
        double total = carrito.calcularPrecioTotal();
        double descuentoElectronica = descuentos.obtenerDescuento(DescuentoPorCategoria.CATEGORIA_ELECTRONICA);
        double descuentoHogar = descuentos.obtenerDescuento(DescuentoPorCategoria.CATEGORIA_HOGAR);
        if (carrito.contieneCategoria(DescuentoPorCategoria.CATEGORIA_ELECTRONICA)) {
            total -= total * descuentoElectronica;
        }
        if (carrito.contieneCategoria(DescuentoPorCategoria.CATEGORIA_HOGAR)) {
            total -= total * descuentoHogar;
        }
        return total;
    }

    public CarritoCompra getCarritoDeCompra() {
        return carrito;
    }    

    public DescuentoPorCategoria getDescuentoPorCategoria() {
        return descuentos;
    }    

    public boolean insertarDescuentoCategoria(String categoria, double descuento) {
        return descuentos.insertar(categoria, descuento);
    }

    public boolean modificarDescuentoCategoria(String categoria, double nuevoDescuento) {
        return descuentos.modificar(categoria, nuevoDescuento);
    }

    public boolean eliminarDescuentoCategoria(String categoria) {
        return descuentos.eliminarDescuento(categoria);
    }

    public String mostrarDescuentos() {
        return descuentos.toString();
    }

    public boolean insertarProductoEnCarrito(Producto producto) {
        return carrito.insertar(producto);
    }

    public boolean eliminarProductoDelCarrito(int id) {
        return carrito.eliminar(id);
    }

    public void limpiarCarrito() {
        carrito.limpiarCarrito();
    }

    public String mostrarCarritoPorCodigo() {
        return carrito.mostrarPorCodigo();
    }

    public String mostrarCarritoPorNombre() {
        return carrito.mostrarPorNombre();
    }

}


