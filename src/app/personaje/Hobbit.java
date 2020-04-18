package app.personaje;

import app.ILlevaReliquia;
import app.reliquia.Reliquia;

public class Hobbit extends Criatura implements ILlevaReliquia {

    public Hobbit(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);
        // TODO Auto-generated constructor stub
    }

    // Reliquia que porta el hobbit
    public Reliquia reliquia;

    @Override
    public Reliquia getReliquia() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setReliquia(Reliquia reliquia) {
        // TODO Auto-generated method stub

    }
}