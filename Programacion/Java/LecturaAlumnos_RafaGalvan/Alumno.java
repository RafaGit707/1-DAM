public class Alumno {

    private String sexo;
    private int edad;
    private double estatura;
    private int puntuacion1;
    private int puntuacion2;
    private String calificacion;

    public Alumno(String sexo, int edad, double estatura, int puntuacion1, int puntuacion2, String calificacion) {
        this.sexo = sexo;
        this.edad = edad;
        this.estatura = estatura;
        this.puntuacion1 = puntuacion1;
        this.puntuacion2 = puntuacion2;
        this.calificacion = calificacion;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public int getPuntuacion1() {
        return puntuacion1;
    }

    public int getPuntuacion2() {
        return puntuacion2;
    }

    public String getCalificacion() {
        return calificacion;
    }
    
}
