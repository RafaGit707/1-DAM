public class Frigorifico extends EquipoFrigorifico {

    public Frigorifico(int alto, int ancho, int profundidad, int frigorias, String marca, int numBaldas)
    {
        super(alto, ancho, profundidad, frigorias, marca);
    }

    @Override
    public double calcularConsumo() {
        return volumen() + super.getFrigorias() * 3;
    }
}
