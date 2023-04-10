package Java.JugadorFutbol;

import java.util.Comparator;

public class Jugador implements Comparable<Jugador> {
    private String NombreCompleto;
    private String Apodo;
    private int Num_Licencia;
    private int numeroGoles;
    private int numeroFaltas;

    public Jugador(String nombreCompleto, String apodo, int num_Licencia) {
        this.NombreCompleto = nombreCompleto;
        this.Apodo = apodo;
        this.Num_Licencia = num_Licencia;
        this.numeroGoles = 0;
        this.numeroFaltas = 0;
    }

    public void hacerGol() {
        this.numeroGoles++;
    }

    public void cometerFalta() {
        this.numeroFaltas++;
    }

    @Override
    public String toString() {
        return NombreCompleto + " (" + Apodo + ") - Goles " + numeroGoles + " - Faltas " + numeroFaltas;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Jugador)) return false;
        Jugador other = (Jugador) obj;
        return this.Num_Licencia == other.Num_Licencia;
    }

    @Override
    public int compareTo(Jugador jugador) {
        return Integer.compare(this.Num_Licencia, jugador.Num_Licencia);
    }

    public static Comparator<Jugador> apodoComparator = new Comparator<Jugador>() {
        @Override
        public int compare(Jugador j1, Jugador j2) {
            int result = j1.Apodo.compareTo(j2.Apodo);
            if (result == 0) {
                return j1.NombreCompleto.compareTo(j2.NombreCompleto);
            }
            return result;
        }
    };

    public static Comparator<Jugador> golesComparator = new Comparator<Jugador>() {
        @Override
        public int compare(Jugador j1, Jugador j2) {
            if (j1.numeroGoles == j2.numeroGoles) {
                return j1.NombreCompleto.compareTo(j2.NombreCompleto);
            }
            return Integer.compare(j2.numeroGoles, j1.numeroGoles);
        }
    };

    public static Comparator<Jugador> faltasComparator = new Comparator<Jugador>() {
        @Override
        public int compare(Jugador j1, Jugador j2) {
            if (j1.numeroFaltas == j2.numeroFaltas) {
                return j1.NombreCompleto.compareTo(j2.NombreCompleto);
            }
            return Integer.compare(j2.numeroFaltas, j1.numeroFaltas);
        }
    };
}
