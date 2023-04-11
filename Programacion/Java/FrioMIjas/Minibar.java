public class Minibar extends EquipoFrigorifico {

    private int numBaldas;

    public Minibar(int alto, int ancho, int profundidad, int frigorias, String marca, int numBaldas) {
        super(alto, ancho, profundidad, frigorias, marca);
        this.numBaldas = numBaldas;
    }

    public int getNumBaldas() {
        return numBaldas;
    }

    public void setNumBaldas(int numBaldas) {
        this.numBaldas = numBaldas;
    }

    @Override
    public double calcularConsumo() {
        return super.getFrigorias() * 2;
    }

}
