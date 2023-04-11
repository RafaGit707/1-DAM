public class Camara extends EquipoFrigorifico {

    private int temperaturaMinima;
    private int temperaturaMaxima;

    public Camara(int alto, int ancho, int profundidad, int frigorias, String marca, int numBaldas, int temperaturaMinima, int temperaturaMaxima) {
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
