package app.personaje;

import app.ILlevaReliquia;
import app.reliquia.Reliquia;

public class Hobbit extends Criatura implements ILlevaReliquia {

    public Reliquia reliquia;

    public Hobbit(String nombre, int salud, int stamina, Reliquia reliquia) {
        super(nombre, salud, stamina);
        this.reliquia = reliquia;
    }

    @Override
    public Reliquia getReliquia() {
        return reliquia;
    }

    @Override
    public void setReliquia(Reliquia reliquia) {
        this.reliquia = reliquia;
    }

}
