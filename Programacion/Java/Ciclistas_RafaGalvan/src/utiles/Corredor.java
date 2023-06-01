package utiles;

class Corredor extends Ciclista {
    int dorsal;
    int tiempo;

    Corredor(Ciclista ciclista, int dorsal) {
        super(ciclista.nombre, ciclista.equipo);
        this.dorsal = dorsal;
        this.tiempo = 0;
    }
}