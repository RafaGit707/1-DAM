public class Arcon extends EquipoFrigorifico {

    private String tipoApertura;

    public Arcon(int alto, int ancho, int profundidad, String tipoApertura, int frigorias, String marca) {
        super(alto, ancho, profundidad, frigorias, marca);
        this.tipoApertura = tipoApertura;
    }

    public String getTipoApertura() {
        return tipoApertura;
    }

    public void setTipoApertura(String tipoApertura) {
        this.tipoApertura = tipoApertura;
    }

    @Override
    public double calcularConsumo() {
        return super.getFrigorias() * 2;
    }
}
