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
                        for (int i = 1; i <= 2; i++) {
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


        // Map<Integer, Jugador> plantilla = new HashMap<>();

        // Scanner sc = new Scanner(System.in);

        // // Introducir datos de los jugadores por consola
        // for (int i = 1; i <= 6; i++) {
        //     System.out.println("Introduce los datos del jugador " + i + ":");
        //     System.out.print("Dorsal: ");
        //     int dorsal = sc.nextInt();
        //     sc.nextLine();
        //     System.out.print("DNI: ");
        //     String dni = sc.nextLine();
        //     System.out.print("Nombre: ");
        //     String nombre = sc.nextLine();
        //     System.out.print("Posición (PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO): ");
        //     Posicion posicion = Posicion.valueOf(sc.nextLine().toUpperCase());
        //     System.out.print("Estatura: ");
        //     int estatura = sc.nextInt();

        //     Jugador jugador = new Jugador(dni, nombre, posicion, estatura);
        //     boolean altaExitosa = EquipoFutbol.altaJugador(plantilla, dorsal, jugador);

        //     if (altaExitosa == true) {
        //         System.out.println("Alta del jugador con dorsal " + dorsal + " realizada correctamente.");
        //     } else {
        //         System.out.println("Error al dar de alta al jugador con dorsal " + dorsal + ".");
        //     }
        // }

        // // Mostrar plantilla completa
        // System.out.println("\nPlantilla completa:");
        // EquipoFutbol.mostrar(plantilla);

        // // Mostrar jugadores por posición
        // String posicionStr = "";
        // System.out.print("\nIntroduce la posición de los jugadores a mostrar: ");
        // Posicion posicion = Posicion.valueOf(posicionStr.toUpperCase());
        // EquipoFutbol.mostrar(plantilla, posicion);

        // // Eliminar jugador
        // System.out.print("\nIntroduce el dorsal del jugador a eliminar: ");
        // int dorsalEliminar = sc.nextInt();
        // Jugador jugadorEliminado = EquipoFutbol.eliminarJugador(plantilla, dorsalEliminar);
        // if (jugadorEliminado != null) {
        //     System.out.println("Jugador con dorsal " + dorsalEliminar + " eliminado correctamente.");
        // } else {
        //     System.out.println("Error al eliminar el jugador con dorsal " + dorsalEliminar + ".");
        // }

        // // Mostrar plantilla actualizada
        // System.out.println("\nPlantilla actualizada:");
        // EquipoFutbol.mostrar(plantilla);

        // // Editar jugador
        // System.out.print("\nIntroduce el dorsal del jugador a editar: ");
        // int dorsalEditar = sc.nextInt();
        // boolean editarExitoso = EquipoFutbol.editarJugador(plantilla, dorsalEditar);
        // if (editarExitoso) {
        //     System.out.println("Jugador con dorsal " + dorsalEditar + " editado correctamente.");
        // } else {
        //     System.out.println("Error al editar el jugador con dorsal " + dorsalEditar + ".");
        // }

        // // Mostrar plantilla final
        // System.out.println("\nPlantilla final:");
        // EquipoFutbol.mostrar(plantilla);

        // sc.close()







        // Map<Integer, Jugador> plantilla = new HashMap<Integer, Jugador>();
        
        // Scanner scanner = new Scanner(System.in);
        
        // System.out.println("Introduce los datos del jugador:");
        
        // System.out.print("Nombre: ");
        // String nombre = scanner.nextLine();
        
        // System.out.print("Apellido: ");
        // String apellido = scanner.nextLine();
        
        // System.out.print("Posicion (POR, DEF, MED, DEL): ");
        // String posicionStr = scanner.nextLine();
        // Posicion posicion = Posicion.valueOf(posicionStr.toUpperCase());
        
        // System.out.print("Dorsal: ");
        // int dorsal = scanner.nextInt();

        // System.out.print("Dorsal: ");
        // String dni = scanner.nextLine();
        
        // Jugador jugador = new Jugador(dni, nombre, apellido, posicion);
        // plantilla.put(dorsal, jugador);
        
        // System.out.println("Jugador añadido a la plantilla.");

        // // crea un objeto Integer a partir de un valor int
        // int dorsal = 5;

        // // llama al método altaJugador con el objeto Integer como segundo argumento
        // EquipoFutbol.altaJugador(plantilla, dorsal);

        // // Mostrar jugadores
        // System.out.println("Plantilla completa:");
        // EquipoFutbol.mostrar(plantilla);

        // Jugador jugador = new Jugador();
        // EquipoFutbol.altaJugador(jugador, dorsal);


        // // Mostrar jugadores por posición
        // System.out.println("\nDefensas:");
        // EquipoFutbol.mostrar(plantilla, Posicion.DEFENSA);

        // System.out.println("\nCentrocampistas:");
        // EquipoFutbol.mostrar(plantilla, Posicion.CENTROCAMPISTA);

        // System.out.println("\nDelanteros:");
        // EquipoFutbol.mostrar(plantilla, Posicion.DELANTERO);

        // System.out.println("\nPorteros:");
        // EquipoFutbol.mostrar(plantilla, Posicion.PORTERO);

        // // Editar jugador
        // EquipoFutbol.editarJugador(plantilla, 1);

        // // Mostrar jugadores actualizados
        // System.out.println("\nPlantilla actualizada:");
        // EquipoFutbol.mostrar(plantilla);

        // // Eliminar jugador
        // EquipoFutbol.eliminarJugador(plantilla, 6);

        // // Mostrar jugadores actualizados
        // System.out.println("\nPlantilla actualizada:");
        // EquipoFutbol.mostrar(plantilla);
    }
}

