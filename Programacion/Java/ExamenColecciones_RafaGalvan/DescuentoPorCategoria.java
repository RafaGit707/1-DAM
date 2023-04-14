package Java.ExamenColecciones_RafaGalvan;

import java.util.HashMap;

public class DescuentoPorCategoria {
    private HashMap<String, Double> descuentos;

    public DescuentoPorCategoria() {
        descuentos = new HashMap<String, Double>();
    }

    public boolean insertar(String categoria, double descuento) {
        if (!descuentos.containsKey(categoria)) {
            descuentos.put(categoria, descuento);
            return true;
        }
        return false;
    }

    public boolean modificar(String categoria, double nuevoDescuento) {
        if (descuentos.containsKey(categoria)) {
            descuentos.put(categoria, nuevoDescuento);
            return true;
        }
        return false;
    }

    public boolean eliminarDescuento(String categoria) {
        if (descuentos.containsKey(categoria)) {
            descuentos.remove(categoria);
            return true;
        }
        return false;
    }

    public double obtener(String categoria) {
        if (descuentos.containsKey(categoria)) {
            return descuentos.get(categoria);
        }
        return 0.0;
    }

    public String mostrarDescuentos() {

        StringBuilder sb = new StringBuilder();

        for (String categoria : descuentos.keySet()) {
            sb.append(categoria).append(" - ").append(descuentos.get(categoria)).append("%\n");
        }
        return sb.toString();
    }
}
