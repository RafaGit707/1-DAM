package Java.EquipoFutbol;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            Map<Integer, Jugador> plantilla = new HashMap<>();

            int opcion = 0;

            while (opcion != 6) {
                System.out.println("\nMenú de opciones:");
                System.out.println("1. Alta de jugador");
                System.out.println("2. Eliminación de jugador");
                System.out.println("3. Mostrar plantilla completa");
                System.out.println("4. Mostrar jugadores por posición");
                System.out.println("5. Editar jugador");
                System.out.println("6. Salir");
                System.out.print("Introduzca una opción (1-6): ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        for (int i = 1; i <= 6; i++) {
                            System.out.println("Introduce los datos del jugador " + i + ":");
                            System.out.print("Dorsal: ");
                            int dorsal = sc.nextInt();
                            sc.nextLine();
                            EquipoFutbol.altaJugador(plantilla, dorsal);
                        }
                        break;
                    case 2:
                        // Eliminar jugador
                        System.out.print("\nIntroduce el dorsal del jugador a eliminar: ");
                        int dorsalEliminar = sc.nextInt();
                        Jugador jugadorEliminado = EquipoFutbol.eliminarJugador(plantilla, dorsalEliminar);
                        if (jugadorEliminado != null) {
                            System.out.println("Jugador con dorsal " + dorsalEliminar + " eliminado correctamente.");
                        } else {
                            System.out.println("Error al eliminar el jugador con dorsal " + dorsalEliminar + ".");
                        }
                        break;
                    case 3:
                        EquipoFutbol.mostrar(plantilla);
                        break;
                    case 4:
                        String posicionStr = "";
                        System.out.print("\nIntroduce la posición de los jugadores a mostrar: ");
                        posicionStr = sc.nextLine();
                        Posicion posicion = Posicion.valueOf(posicionStr.toUpperCase());
                        EquipoFutbol.mostrar(plantilla, posicion);
                        break;
                    case 5:
                        System.out.print("\nIntroduce el dorsal del jugador a editar: ");
                        int dorsalEditar = sc.nextInt();
                        boolean editarExitoso = EquipoFutbol.editarJugador(plantilla, dorsalEditar);
                        if (editarExitoso) {
                            System.out.println("Jugador con dorsal " + dorsalEditar + " editado correctamente.");
                        } else {
                            System.out.println("Error al editar el jugador con dorsal " + dorsalEditar + ".");
                        }
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            }
            sc.close();
 
    }
}

