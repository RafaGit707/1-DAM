public class Camara extends EquipoFrigorifico {

    private int temperaturaMinima;
    private int temperaturaMaxima;

    public Camara(double alto, double ancho, double profundidad, int temperaturaMinima, int temperaturaMaxima, int frigorias, String marca) {
        super(alto, ancho, profundidad, frigorias, marca);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(int temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    @Override
    public double calcularConsumo() {
        return super.getFrigorias() * 5 + volumen();
    }
}
