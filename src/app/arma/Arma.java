package app.arma;

public class Arma {
    public String nombre;
    public int danio;
    public int stamina;
    
    
    public Arma(String nombre, int danio, int stamina) {
        this.nombre = nombre;
        this.danio = danio;
        this.stamina = stamina;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDanio() {
        return danio;
    }
}
