package futbol;

import java.security.KeyStore;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsa;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsa) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsa = dorsa;
    }

    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    public String toString() {
        return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+",y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+". La han marcado "+ this.golesRecibidos;
    }

    public Portero(short golesRecibidos, byte dorsa) {
        this.golesRecibidos = golesRecibidos;
        this.dorsa = dorsa;
    }

    public boolean jugarConLasManos() {
        return true;
    }
    @Override
    public int compareTo(Futbolista o) {
        Portero f = (Portero) o;
        int comparacion = Math.abs(f.getGolesRecibidos()-this.getGolesRecibidos());
        return comparacion;

    }
}
