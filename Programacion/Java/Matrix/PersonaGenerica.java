package Java.Matrix;

public class PersonaGenerica extends Personaje {

    public PersonaGenerica(int id, String nombre, String ciudadNacimiento, int edad, int probabilidadMorir) {
        super(id, nombre, ciudadNacimiento, ciudadNacimiento, edad, probabilidadMorir);
    }

    @Override
    public String mostrarInformacion() {
        return String.format(mostrarInformacion());
    }
}

