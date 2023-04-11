public abstract class EquipoFrigorifico {
    protected int alto;
    protected int ancho;
    protected int profundidad;
    protected int frigorias;
    protected String marca;

    public EquipoFrigorifico(int alto, int ancho, int profundidad, int frigorias, String marca) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.frigorias = frigorias;
        this.marca = marca;
    }

    public abstract double calcularConsumo();

    public double volumen() {
        return this.alto * this.ancho * this.profundidad;
    }

    // Getters y setters
    public double getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    public double getFrigorias() {
        return frigorias;
    }

    public void setFrigorias(int frigorias) {
        this.frigorias = frigorias;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}