package app.arma;

public class Arma {
    private String nombre;
    private int danio;
    private int stamina;


    public Arma(String nombre, int danio, int stamina) {
        this.nombre = nombre;
        this.danio = danio;
        this.stamina = stamina;
    }

    public String getNombre() {
        return nombre;

    }

    public int getStamina(){
        return stamina;
    }

    public int getDanio() {
        return danio;
    }

}
