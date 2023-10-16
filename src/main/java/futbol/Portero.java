package futbol;

import java.security.KeyStore;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    public String toString() {
        return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+". Le han marcado "+this.golesRecibidos;

    public Portero(short golesRecibidos, byte dorsal) {
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    public boolean jugarConLasManos() {
        return true;
    }
    public int compareTo(Portero n) {

        if (this.getGolesRecibidos() > n.getGolesRecibidos()) {

            return this.getGolesRecibidos()- n.getGolesRecibidos();
        }

        else {

            return n.getGolesRecibidos()- this.getGolesRecibidos();
        }
    }
}
