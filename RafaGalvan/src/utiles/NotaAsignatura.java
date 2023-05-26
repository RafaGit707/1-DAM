public class NotaAsignatura {
    private String asignatura;
    private double nota;

    public NotaAsignatura(String asignatura, double nota) {
        this.asignatura = asignatura;
        this.nota = nota;
    }

    // Getters y setters

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}