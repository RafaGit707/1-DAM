import java.util.Random;

public class Contraseña {

    private int longitud;
    private String contraseña;

    Contraseña() {
        this(8);
    }

    Contraseña(int longitud) {
        this.longitud = longitud;
        this.contraseña = generaPassword();
    }

    private String generaPassword() {
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        while (password.length() < longitud) {
            int tipoCaracter = random.nextInt(3);
            char caracter = 'a';

            switch (tipoCaracter) {
                case 0: // mayuscula
                    caracter = (char) (random.nextInt(26) + 'A');
                    mayusculas++;
                    break;
                case 1: // minuscula
                    caracter = (char) (random.nextInt(26) + 'a');
                    minusculas++;
                    break;
                case 2: // numero
                    caracter = (char) (random.nextInt(10) + '0');
                    numeros++;
                    break;
            }

            password.append(caracter);
        }

        return password.toString();
    }

    private int cuentaMayusculas() {
        int mayusculas = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isUpperCase(contraseña.charAt(i))) {
                mayusculas++;
            }
        }

        return mayusculas;
    }

    private int cuentaMinusculas() {
        int minusculas = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isLowerCase(contraseña.charAt(i))) {
                minusculas++;
            }
        }

        return minusculas;
    }

    private int cuentaNumeros() {
        int numeros = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isDigit(contraseña.charAt(i))) {
                numeros++;
            }
        }

        return numeros;
    }

    public boolean esFuerte() {
        int mayusculas = cuentaMayusculas();
        int minusculas = cuentaMinusculas();
        int numeros = cuentaNumeros();

        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }


    public void generaPassword(int longitud) {
        this.longitud = longitud;
        contraseña = generaPassword();
    }

    public String getContrasena() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

}
