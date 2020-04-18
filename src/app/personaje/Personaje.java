package app.personaje;

import app.arma.Arma;

import java.util.List;

public class Personaje {

    String nombre;
    int salud; // max 100
    int stamina;// resistencia
    List<Arma> armas;// las armas disponibles que tiene que usar

    public Personaje(String nombre, int salud, int stamina) {
        this.nombre = nombre;
        this.salud = salud;
        this.stamina = stamina;
    }
    // Devuelve true si el personaje esta vivo
    public boolean estaVivo() {
        return false;
    }

    // Ataca a personaje "personaje", usando el arma "arma"
    public void atacar(Personaje personaje, Arma arma) {
    }

}
