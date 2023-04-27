package Java.Matrix;

class PersonaGenerica extends Personaje {

    public PersonaGenerica(int id, String nombre, String ciudadNacimiento, int edad, int probabilidadMorir) {
        super(id, nombre, ciudadNacimiento, "", edad, probabilidadMorir);
    }

    @Override
    public String mostrarInformacion() {
        return "Soy una persona genérica";
    }
}

