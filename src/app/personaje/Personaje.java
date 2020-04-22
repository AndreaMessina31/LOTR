package app.personaje;

import app.arma.Arma;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private String nombre;
    private int salud; // max 100
    private int stamina;// resistencia
    private List<Arma> armas = new ArrayList<Arma>(); // las armas disponibles que tiene que usar

    public Personaje(String nombre, int salud, int stamina) {
        this.nombre = nombre;
        this.salud = salud;
        this.stamina = stamina;
    }

    // Devuelve true si el personaje esta vivo
    public boolean estaVivo() {
        return salud > 0;
    }

<<<<<<< HEAD
    // Ataca a personaje "personajeAtacado", usando el arma "arma"
    public void atacar(Personaje personajeAtacado, Arma arma) {
        //una arma
        //Si el personaje esta vivo y tiene stamina puede atacar.
        if (estaVivo() && this.getStamina() > 0 ){

=======
<<<<<<< HEAD
    // Ataca a personaje "personajeAtacado", usando el arma "arma"
    public void atacar(Personaje personajeAtacado, Arma arma) {
        //Si el personaje esta vivo y tiene stamina puede atacar.
        if (estaVivo() && this.getStamina() > 0 )
>>>>>>> 00737a9be135a4d83f981aa9c8784560f219a389
            // Se le resta danio al personaje atacado y se le descuenta en "salud"
            personajeAtacado.setSalud(personajeAtacado.getSalud() - arma.getDanio());
            //La stamina del arma  decrementa la stamina del personaje.
            this.setStamina(this.getStamina() - arma.getStamina());
<<<<<<< HEAD
        }
    }

    public void agregarArma(Arma arma){
        this.armas.add(arma);
=======
=======
    // Ataca a personaje "personaje", usando el arma "arma"
    public void atacar(Personaje otroPersonaje, Arma arma) {
>>>>>>> 786f2c86f5e2763388c68baee99ad0408900bf18
>>>>>>> 00737a9be135a4d83f981aa9c8784560f219a389
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

<<<<<<< HEAD
    public void setSalud(int salud) {
        this.salud = salud;
    }

=======
>>>>>>> 00737a9be135a4d83f981aa9c8784560f219a389
    public int getStamina() {
        return stamina;
    }

<<<<<<< HEAD
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", salud=" + salud +
                ", stamina=" + stamina +
                ", armas=" + armas +
                '}';
=======
    public void setSalud(int salud) {
        this.salud = salud;
    }
    public void setStamina(int stamina){
        this.stamina = stamina;
>>>>>>> 00737a9be135a4d83f981aa9c8784560f219a389
    }
}
