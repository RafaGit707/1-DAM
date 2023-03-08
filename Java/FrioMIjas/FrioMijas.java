import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class FrioMijas {

    public static void main(String[] args) {
        
        Jefe jefe1 = new Jefe("Jefazo", "Garcia", 45, 2500, "45000001X");
        Jefe jefe2 = new Jefe("Jefe_malaga", "Lopez", 34, 2100, "77000002P");

        Sede sede1 = new Sede("Madrid", "Calle ancha", 80881, jefe1);
        Sede sede2 = new Sede("Malaga", "Calle Larios", 29001);
        sede2.setJefe(jefe2);

        Empleado empleado1 = new Empleado("Daniel", "ape1", 35, 1000, "88000008W" );
        Empleado empleado2 = new Empleado("Juan", "ape2", 35, 1200, "21000008E" );
        Empleado empleado3 = new Empleado("Maria", "ape3", 55, 1700, "99000008R" );
        Empleado empleado4 = new Empleado("Pepe", "ape4", 45, 900, "66000008Y" );
        Empleado empleado5 = new Empleado("Pedro", "ape5", 30, 2000, "54000008T" );
        Empleado empleado6 = new Empleado("Daniel", "ape6", 24, 1000, "12000008P" );
        Empleado empleado7 = new Empleado("Pilar", "ape7", 24, 1000, "12000008P" );

        System.out.println(empleado1);
        System.out.println(empleado2);

        sede1.addEmpleado(empleado1);
        sede1.addEmpleado(empleado2);

        sede2.addEmpleado(empleado3);
        sede2.addEmpleado(empleado4);
        sede2.addEmpleado(empleado5);
        sede2.addEmpleado(empleado6);
        sede2.addEmpleado(empleado7);

        //Cambiamos contraseñas
        System.out.println(jefe1);
        jefe1.generaPassword(5);
        System.out.println("Nueva contraseña para jefe1");
        System.out.println(jefe1);

        System.out.println(jefe2);
        jefe2.generaPassword();
        System.out.println("Nueva contraseña para jefe2");
        System.out.println(jefe2);

        //Mostrar la información completa de cada una de las sedes + jefe + empleados
        System.out.println(sede1);
        
        System.out.println(sede2);

        /*
         * HACER *
         * Mostrar si la contraseña de los jefes es no Fuerte
         */

         /*
          * HACER
          * Generar contraseña de 10 elementos que sea fuerte para cada uno de los jefes
          */

         /*
         * HACER *
         * Empleados de la sede2 con sueldo entre 500 y 1500 
         */

        /*
         * HACER *
         * Crea 5 equipos frigorificos diferentes y asignalos a la 2º sede y muéstralos a continuación   
         */
 
        EquipoFrigorifico minibar = new Minibar(50, 30, 40, 1000, "LG", 150);
        EquipoFrigorifico frigorifico = new Frigorifico(150, 60, 60, 3000, "Samsung", 500);
        EquipoFrigorifico arcon = new Arcon(100, 80, 60, 2000, "Whirlpool", 400, "superior");
        EquipoFrigorifico camara = new Camara(200, 200, 200, 8000, "Frigicoll", 2000, -20, 10);

        // Crear equipos frigoríficos y agregarlos a la sede
        Frigorifico frigo1 = new Frigorifico(180, 70, 60, 2500, "Samsung", 3000);
        Arcon arcon1 = new Arcon(100, 80, 70, 1500, "Bosch", 1500, "Abatible");
        Camara camara1 = new Camara(200, 150, 250, 6000, "LG", 10000, -10, 10);
        Minibar minibar1 = new Minibar(50, 40, 30, 1000, "Philips", 500, 2);

        sede1.addEquipoFrigorifico(frigo1);
        sede1.addEquipoFrigorifico(arcon1);
        sede1.addEquipoFrigorifico(camara1);
        sede1.addEquipoFrigorifico(minibar1);
    
        System.out.println(sede1);
    
        // Mostrar el consumo de cada equipo frigorífico
        System.out.println("Consumo de equipos frigoríficos en sede 1:");
        for (EquipoFrigorifico equipo : sede1.getEquiposFrigorificos()) {
            System.out.println(equipo.getClass().getSimpleName() + ": " + equipo.calcularConsumo() + " kWh/mes");
        }
    }

    
}
