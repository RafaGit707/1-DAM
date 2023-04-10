package Java.JugadorFutbol;

import java.util.Comparator;

public class Jugador implements Jugar_I, Comparable<Jugador> {
    private static int ultimaLicencia = 999;
    private String nombreCompleto;
    private String apodo;
    private int numLicencia;
    private int numeroGoles;
    private int numeroFaltas;

    public Jugador(String nombreCompleto, String apodo, int numLicencia) {
        this.nombreCompleto = nombreCompleto;
        this.apodo = apodo;
        this.numLicencia = ++ultimaLicencia;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getApodo() {
        return apodo;
    }

    public int getNumLicencia() {
        return numLicencia;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    public void hacerGol() {
        numeroGoles++;
    }

    public void cometerFalta() {
        numeroFaltas++;
    }

    public String toString() {
        return nombreCompleto + " (" + apodo + ") - Goles " + numeroGoles + " - Faltas " + numeroFaltas;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Jugador) {
            Jugador otro = (Jugador) obj;
            return numLicencia == otro.numLicencia;
        }
        return false;
    }

    public int compareTo(Jugador otro) {
        return numLicencia - otro.numLicencia;
    }

    public static Comparator<Jugador> comparadorApodo() {
        return new Comparator<Jugador>() {
            public int compare(Jugador j1, Jugador j2) {
                int res = j1.apodo.compareTo(j2.apodo);
                if (res == 0) {
                    res = j1.nombreCompleto.compareTo(j2.nombreCompleto);
                }
                return res;
            }
        };
    }

    public static Comparator<Jugador> comparadorGoles() {
        return new Comparator<Jugador>() {
            public int compare(Jugador j1, Jugador j2) {
                int res = j2.numeroGoles - j1.numeroGoles;
                if (res == 0) {
                    res = j1.nombreCompleto.compareTo(j2.nombreCompleto);
                }
                return res;
            }
        };
    }

    public static Comparator<Jugador> comparadorFaltas() {
        return new Comparator<Jugador>() {
            public int compare(Jugador j1, Jugador j2) {
                int res = j2.numeroFaltas - j1.numeroFaltas;
                if (res == 0) {
                    res = j1.nombreCompleto.compareTo(j2.nombreCompleto);
                }
                return res;
            }
        };
    }
}
