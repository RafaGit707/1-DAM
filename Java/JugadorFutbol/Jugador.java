package Java.JugadorFutbol;

import java.util.Comparator;

public class Jugador implements Jugar_I, Comparable<Jugador> {

    private static int contadorLicencia = 1000;
    private String nombreCompleto;
    private String apodo;
    private int numLicencia;
    private int numeroGoles;
    private int numeroFaltas;

    // public Jugador(String nombreCompleto, String apodo, int numLicencia) {
    //     this.nombreCompleto = nombreCompleto;
    //     this.apodo = apodo;
    //     this.numLicencia = ++contadorLicencia;
    //     this.numeroGoles = 0;
    //     this.numeroFaltas = 0; 
    // }

    public Jugador(String nombreCompleto, String apodo, int numLicencia, int numeroGoles, int numeroFaltas) {
        this.nombreCompleto = nombreCompleto;
        this.apodo = apodo;
        this.numeroGoles = numeroGoles;
        this.numeroFaltas = numeroFaltas;
        this.numLicencia = numLicencia;
    }

    public Jugador(String nombreCompleto, String apodo, int numeroGoles, int numeroFaltas) {
        this(nombreCompleto, apodo, contadorLicencia++, numeroGoles, numeroFaltas);
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

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    @Override
    public String toString() {
        return nombreCompleto + " (" + apodo + ") - Goles " + numeroGoles + " - Faltas " + numeroFaltas;
    }

    @Override
    public void hacerGol() {
        this.numeroGoles++;
        System.out.println("¡Gol de " + this.nombreCompleto + "!");
        
        // buscar el jugador en la lista y actualizar sus valores
        for (int i = 0; i < JugadoresSpain.getJugadores().size(); i++) {
            if (JugadoresSpain.getJugadores().get(i).equals(this)) {
                JugadoresSpain.getJugadores().get(i).setNumeroGoles(this.numeroGoles);
                break;
            }
        }
    }

    @Override
    public void cometerFalta() {
        this.numeroFaltas++;
        System.out.println("Falta cometida por " + this.nombreCompleto);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Jugador)) {
            return false;
        }
        Jugador jugador = (Jugador) obj;
        return numLicencia == jugador.getNumLicencia();
    }

    @Override
    public int compareTo(Jugador jugador) {
        return Integer.compare(numLicencia, jugador.getNumLicencia());
    }

    public static Comparator<Jugador> ComparadorApodo() {
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

    public static Comparator<Jugador> ComparadorGoles() {
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

    public static Comparator<Jugador> ComparadorFaltas() {
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
