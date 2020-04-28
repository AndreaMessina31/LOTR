package app.personaje;

import app.IEsMagico;
import app.IHaceMagia;
import app.ILlevaReliquia;
import app.arma.Arma;
import app.reliquia.Reliquia;

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

    public boolean tieneStamina() {
        return stamina > 0 ;
    }

    // Ataca a personaje "personajeAtacado", usando el arma "arma"
    public void atacar(Personaje personajeAtacado, Arma arma) {

        if(this instanceof ILlevaReliquia){
            ILlevaReliquia personajeQueLlevaReliquia = (ILlevaReliquia) this;
            Reliquia r = personajeQueLlevaReliquia.getReliquia();
            System.out.println(" FACTOR ATAQUE ");
            r.atacarConReliquia(arma);
        }

        if (personajeAtacado instanceof ILlevaReliquia) {
            ILlevaReliquia atacado = (ILlevaReliquia) personajeAtacado;
            Reliquia r = atacado.getReliquia();
            System.out.println(" FACTOR DEFENSA ");
            r.defensaReliquia(personajeAtacado);
        }

        //TODO mejorar los repetidos 55, 62 y 68

        if (this instanceof IHaceMagia) {
            IHaceMagia personajeQueHaceMagia = (IHaceMagia) this;
            if(personajeQueHaceMagia.puedoEjecutarAtaqueEpico()){
                personajeQueHaceMagia.ataqueEpico(personajeAtacado, arma);
            }else {
                // Se le resta danio al personaje atacado y se le descuenta en "salud"
                personajeAtacado.setSalud(personajeAtacado.getSalud() - arma.getDanio());
                //La stamina del arma  decrementa la stamina del personaje.
                this.setStamina(this.getStamina() - arma.getStamina());
            }

        }else {
            // Se le resta danio al personaje atacado y se le descuenta en "salud"
            personajeAtacado.setSalud(personajeAtacado.getSalud() - arma.getDanio());
            //La stamina del arma  decrementa la stamina del personaje.
            this.setStamina(this.getStamina() - arma.getStamina());
        }

        // Se le resta danio al personaje atacado y se le descuenta en "salud"
        personajeAtacado.setSalud(personajeAtacado.getSalud() - arma.getDanio());
        //La stamina del arma  decrementa la stamina del personaje.
        this.setStamina(this.getStamina() - arma.getStamina());
    }

    public void agregarArma(Arma arma){
        this.armas.add(arma);
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getStamina() {
        return stamina;
    }

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
    }
}
