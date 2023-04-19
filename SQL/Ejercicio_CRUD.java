package SQL;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio_CRUD {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/people";
        String user = "admin";
        String pass = "admin";
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión a la base de datos OK.");
            boolean fin_bucle = false;
            do {
                mostrarMenu();
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        consultarCliente(connection);
                        break;
                    case 2:
                        darDeAltaCliente(connection);
                        break;
                    case 3:
                        darDeBajaCliente(connection);
                        break;
                    case 4:
                        modificarCliente(connection);
                        break;
                    case 0:
                        fin_bucle = true;
                        break;
                    default:
                        System.out.println("Indique una opción entre [0 - 4]");
                }
            } while (!fin_bucle);
            connection.close();
            System.out.println("Connection closed.");
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
    }

    private static void mostrarMenu() {
        System.out.println();
        System.out.println("Menú:");
        System.out.println("1 - Consulta de los datos de un cliente.");
        System.out.println("2 - Alta de cliente.");
        System.out.println("3 - Baja de cliente (pedirá confirmación antes de efectuarla).");
        System.out.println("4 - Modificación en los datos de un cliente (podrá modificar Nombre y/o Apellidos y/o Teléfono).");
        System.out.println("0 - Fin del programa (retorno al S.O.)");
        System.out.print("Seleccione una opción: ");
    }

    private static void consultarCliente(Connection connection) throws SQLException {
        System.out.println();
        System.out.print("Introduzca el DNI del cliente: ");
        String dni = sc.nextLine();
        if (dni.trim().isEmpty()) {
            System.out.print("Introduzca el teléfono del cliente: ");
            String telefono = sc.nextLine();
            if (telefono.trim().isEmpty()) {
                return;
            } else {
                mostrarClientePorTelefono(connection, telefono);
            }
        } else {
            mostrarClientePorDni(connection, dni);
        }
    }

    private static void mostrarClientePorDni(Connection connection, String dni) throws SQLException {
        String query = "SELECT * FROM clientes WHERE dni=?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, dni);
            ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    System.out.println("Nombre: " + rs.getString("nombre"));
                    System.out.println("Apellidos: " + rs.getString("apellidos"));
                    System.out.println("Teléfono: " + rs.getString("telefono"));
                } else {
                    System.out.println("No se encontró ningún cliente con el DNI " + dni);
                }
        }
    }

    private static void mostrarClientePorTelefono(Connection connection, String telefono) throws SQLException {
        String query = "SELECT * FROM clientes WHERE telefono=?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, telefono);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Apellidos: " + rs.getString("apellidos"));
                System.out.println("DNI: " + rs.getString("dni"));
            } else {
                System.out.println("No se encontró ningún cliente con el teléfono " + telefono);
            }
        }
    }
    
    private static void darDeAltaCliente(Connection connection) throws SQLException {
        System.out.println();
        System.out.print("Introduzca el DNI del nuevo cliente: ");
        String dni = sc.nextLine();
        System.out.print("Introduzca el nombre del nuevo cliente: ");
        String nombre = sc.nextLine();
        System.out.print("Introduzca los apellidos del nuevo cliente: ");
        String apellidos = sc.nextLine();
        System.out.print("Introduzca el teléfono del nuevo cliente: ");
        String telefono = sc.nextLine();
        String query = "INSERT INTO clientes (dni, nombre, apellidos, telefono) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, dni);
            stmt.setString(2, nombre);
            stmt.setString(3, apellidos);
            stmt.setString(4, telefono);
            int rows = stmt.executeUpdate();
            System.out.println(rows + " fila(s) insertada(s) correctamente.");
        }
    }
    
    private static void darDeBajaCliente(Connection connection) throws SQLException {
        System.out.println();
        System.out.print("Introduzca el DNI del cliente a dar de baja: ");
        String dni = sc.nextLine();
        if (dni.trim().isEmpty()) {
            System.out.print("Introduzca el teléfono del cliente a dar de baja: ");
            String telefono = sc.nextLine();
            if (telefono.trim().isEmpty()) {
                return;
            } else {
                dni = buscarDniPorTelefono(connection, telefono);
            }
        }
        mostrarClientePorDni(connection, dni);
        System.out.print("¿Está seguro de que desea dar de baja a este cliente? (s/n): ");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            String query = "DELETE FROM clientes WHERE dni=?";
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setString(1, dni);
                int rows = stmt.executeUpdate();
                System.out.println(rows + " fila(s) eliminada(s) correctamente.");
            }
        } else {
            System.out.println("Operación cancelada.");
        }
    }
    private static String buscarDniPorTelefono(Connection connection, String telefono) throws SQLException {
        String dni = null;
        String query = "SELECT dni FROM clientes WHERE telefono=?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, telefono);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                dni = rs.getString("dni");
            } else {
                System.out.println("No se encontró ningún cliente con el teléfono " + telefono);
            }
        }
        return dni;
    }
    
    private static void modificarCliente(Connection connection) throws SQLException {
        System.out.println();
        System.out.print("Introduzca el DNI del cliente a modificar: ");
        String dni = sc.nextLine();
        if (dni.trim().isEmpty()) {
            System.out.print("Introduzca el teléfono del cliente a modificar: ");
            String telefono = sc.nextLine();
            if (telefono.trim().isEmpty()) {
                return;
            } else {
                dni = buscarDniPorTelefono(connection, telefono);
            }
        }
        mostrarClientePorDni(connection, dni);
        System.out.print("¿Está seguro de que desea modificar los datos de este cliente? (s/n): ");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Introduzca el nuevo nombre del cliente (dejar en blanco si no se quiere modificar): ");
            String nombre = sc.nextLine();
            System.out.print("Introduzca los nuevos apellidos del cliente (dejar en blanco si no se quiere modificar): ");
            String apellidos = sc.nextLine();
            System.out.print("Introduzca el nuevo teléfono del cliente (dejar en blanco si no se quiere modificar): ");
            String telefono = sc.nextLine();
            String query = "UPDATE clientes SET ";
            boolean primero = true;
            if (!nombre.trim().isEmpty()) {
                query += "nombre=?";
                primero = false;
            }
            if (!apellidos.trim().isEmpty()) {
                if (!primero) {
                    query += ", ";
                }
                query += "apellidos=?";
                primero = false;
            }
            if (!telefono.trim().isEmpty()) {
                if (!primero) {
                    query += ", ";
                }
                query += "telefono=?";
            }
            query += " WHERE dni=?";
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                int i = 1;
                if (!nombre.trim().isEmpty()) {
                    stmt.setString(i++, nombre);
                }
                if (!apellidos.trim().isEmpty()) {
                    stmt.setString(i++, apellidos);
                }
                if (!telefono.trim().isEmpty()) {
                    stmt.setString(i++, telefono);
                }
                stmt.setString(i, dni);
                int rows = stmt.executeUpdate();
                System.out.println(rows + " fila(s) actualizada(s) correctamente.");
            }
        } else {
            System.out.println("Operación cancelada.");
        }
    }
}
