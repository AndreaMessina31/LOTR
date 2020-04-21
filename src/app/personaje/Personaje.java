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

<<<<<<< HEAD
    // Ataca a personaje "personajeAtacado", usando el arma "arma"
    public void atacar(Personaje personajeAtacado, Arma arma) {
        //Si el personaje esta vivo y tiene stamina puede atacar.
        if (estaVivo() && this.getStamina() > 0 )
            // Se le resta danio al personaje atacado y se le descuenta en "salud"
            personajeAtacado.setSalud(personajeAtacado.getSalud() - arma.getDanio());
            //La stamina del arma  decrementa la stamina del personaje.
            this.setStamina(this.getStamina() - arma.getStamina());
=======
    // Ataca a personaje "personaje", usando el arma "arma"
    public void atacar(Personaje otroPersonaje, Arma arma) {
>>>>>>> 786f2c86f5e2763388c68baee99ad0408900bf18
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getStamina() {
        return stamina;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
    public void setStamina(int stamina){
        this.stamina = stamina;
    }
}
