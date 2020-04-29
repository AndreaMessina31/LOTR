package app.personaje;

public class Criatura extends Personaje {

    public Criatura(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);
    }

    @Override
    public String toString() {
        return super.toString() + "Criatura{}";
    }
}