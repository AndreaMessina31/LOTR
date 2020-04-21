package app.personaje;

import app.arma.Arma;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private String nombre;
    private int salud; // max 100
    private int stamina;// resistencia
    private List<Arma> armas = new ArrayList<Arma>(); // las armas disponibles que tiene que usar

    public Personaje(String nombre, int salud, int stamina, List<Arma> armas) {
        this.nombre = nombre;
        this.salud = salud;
        this.stamina = stamina;
        this.armas = armas;
    }

    // Devuelve true si el personaje esta vivo
    public boolean estaVivo() {
        return salud > 0;
    }

    // Ataca a personaje "personaje", usando el arma "arma"
    public void atacar(Personaje otroPersonaje, Arma arma) {
        if(estaVivo()) otroPersonaje.getSalud() -= arma.getDanio();
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }
}
