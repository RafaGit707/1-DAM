package Java.Academia;
    
public class Academico implements Comparable<Academico> {
    
    private String nombre;
    private int añoIngreso;

    public Academico() {

    }

    public Academico(String nombre, int añoIngreso) {
        this.nombre = nombre;
        this.añoIngreso = añoIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso() {

    }

    @Override
    public int compareTo(Academico academico) {
        return nombre.compareTo(academico.getNombre());
    }
}
