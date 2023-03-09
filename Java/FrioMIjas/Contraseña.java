import java.util.Random;

public class Contraseña {

    private int longitud;
    private String contraseña = "";

    Contraseña() {
        this(8);
        generaPassword();
    }

    Contraseña(int longitud) {
        this.longitud = longitud;
        generaPassword();
    }

    public void generaPassword() {
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        int mayus = 0, minus = 0, nums = 0;

        for (int i = 0; i < this.longitud; i++) {
            int tipo = r.nextInt(3); // Tipo de carácter: 0 = mayúscula, 1 = minúscula, 2 = número
            switch (tipo) {
                case 0:
                    sb.append(mayusculas.charAt(r.nextInt(mayusculas.length())));
                    mayus++;
                    break;
                case 1:
                    sb.append(minusculas.charAt(r.nextInt(minusculas.length())));
                    minus++;
                    break;
                case 2:
                    sb.append(numeros.charAt(r.nextInt(numeros.length())));
                    nums++;
                    break;
            }
        }

        // Asegurarse de que se cumplan los requisitos de "fuerte"
        if (mayus > 2 && minus > 1 && nums >= 5) {
            this.contraseña = sb.toString();
        } else {
            generaPassword();
        }
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

        return cuentaMayusculas() > 2 && cuentaMinusculas() > 1 && cuentaNumeros() > 5;
    }

    public String getContraseña() {
        return this.contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getLongitud() {
        return this.longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }


}
