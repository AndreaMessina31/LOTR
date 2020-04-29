package app.personaje;

import app.ILlevaReliquia;
import app.arma.Arma;
import app.reliquia.Reliquia;

public class Hobbit extends Criatura implements ILlevaReliquia {

    // Reliquia que porta el hobbit
    public Reliquia reliquia;

    public Hobbit(String nombre, int salud, int stamina, Reliquia reliquia) {
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
        return super.toString() + "Hobbit{" + "reliquia=" + reliquia.getNombre() + '}';
    }

   

    }
