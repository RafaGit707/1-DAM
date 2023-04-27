package Java.Matrix;

import java.util.ArrayList;

public class DepositoVirus {

    private static ArrayList<Smith> virus = new ArrayList<>();

    public static void agregarVirus(Smith smith) {
        virus.add(smith);
    }

    public static void eliminarVirus(Smith smith) {
        virus.remove(smith);
    }

    public static void mostrarVirus() {
        System.out.println("Lista de virus en el depósito:");
        for (Smith smith : virus) {
            System.out.println(smith.toString());
        }
    }

    public static ArrayList<Smith> getVirus() {
        return virus;
    }
    
    public static void mostrarInformacionVirus() {
        System.out.println("Información de los virus en el depósito:");
        for (Smith smith : virus) {
            smith.mostrarInformacion();
            System.out.println("Capacidad de infección: " + smith.getCapacidadInfeccion());
        }
    }

    public static void inicializarDepositoVirus() {
        // Create some Smith objects to add to the virus ArrayList
        Smith virus1 = new Smith(1, "Smith 1", "Ciudad 1", "12:00", 0, 0, 50);
        Smith virus2 = new Smith(2, "Smith 2", "Ciudad 2", "12:00", 0, 0, 30);
        Smith virus3 = new Smith(3, "Smith 3", "Ciudad 3", "12:00", 0, 0, 70);
    
        // Add the Smith objects to the virus ArrayList
        agregarVirus(virus1);
        agregarVirus(virus2);
        agregarVirus(virus3);
    }
    

}
