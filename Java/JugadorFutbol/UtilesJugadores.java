package Java.JugadorFutbol;
import java.util.Random;

public class UtilesJugadores {

    private static Random random = new Random();

    private static int contadorLicencia = 1000;

    private static String[] nombres = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel"};
    private static String[] apellidos = {"García", "Fernández", "Martínez", "González", "Pérez", "López", "Ruiz", "Sánchez", "Hernández", "Jiménez"};
    private static String[] apodo1 = {"Grande", "Pulga", "Raton", "Mago", "La roca", "Titan", "Cabeza", "Jardinero", "Carnicero", "Muñeco", "Burro", "Pantera"};
    private static String[] apodo2 = {"de Oro", "de los mares", "de Mijas", "de Titanio", "loca", "Blanco", "Negro"};

    public static Jugador GeneraJugadorAleatorio() {
        String nombreCompleto, apodo;
        int numLicencia = contadorLicencia++;
        int numeroGoles = 0, numeroFaltas = 0;

        do {
            nombreCompleto = nombres[random.nextInt(nombres.length)] + " " + apellidos[random.nextInt(apellidos.length)];
        } while (existeJugador(nombreCompleto));

        apodo = apodo1[random.nextInt(apodo1.length)] + " " + apodo2[random.nextInt(apodo2.length)];

        return new Jugador(nombreCompleto, apodo, numLicencia, numeroGoles, numeroFaltas);
    }

    private static boolean existeJugador(String nombreCompleto) {
        for (Jugador jugador : JugadoresSpain.getJugadores()) {
            if (jugador.getNombreCompleto().equals(nombreCompleto)) {
                return true;
            }
        }
        return false;
    }
    
}
