package app;

import java.util.List;

public class Personaje {

    String nombre;
    int salud; // max 100
    int stamina;// resistencia
    List<Arma> armas;// las armas disponibles que tiene que usar

    // Devuelve true si el personaje esta vivo
    public boolean estaVivo() {
        return false;
    }

    // Ataca a personaje "personaje", usando el arma "arma"
    public void atacar(Personaje personaje, Arma arma) {
    }

}
