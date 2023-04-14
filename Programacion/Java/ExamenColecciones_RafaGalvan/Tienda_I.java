package Java.ExamenColecciones_RafaGalvan;

public interface Tienda_I {
    boolean insertarProducto(Producto producto);
    String mostrarProductosPorNombre();
    String mostrarProductosPorId();
    Producto buscarProducto(int id);
    double obtenerCuentaTotal();
}
