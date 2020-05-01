package app.personaje;

import app.ILlevaReliquia;
import app.arma.Arma;
import app.reliquia.Reliquia;

public class Humano extends Personaje implements ILlevaReliquia {

    public Reliquia reliquia;// Reliquia que porta el humano

    public Humano(String nombre, int salud, int stamina, Reliquia reliquia) {
        super(nombre, salud, stamina);
        this.reliquia = agregarReliquia(reliquia);
    }

    @Override
    public Reliquia getReliquia() {
        return reliquia;
    }

    @Override
    public void setReliquia(Reliquia reliquia) {
        this.reliquia = reliquia;
    }

    @Override
    public String toString() {
        return super.toString() + "Humano{" + "reliquia=" + reliquia + '}';
    }



    }
