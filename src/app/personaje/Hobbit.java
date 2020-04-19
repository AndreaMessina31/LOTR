package app.personaje;

import java.util.List;

import app.ILlevaReliquia;
import app.arma.Arma;
import app.reliquia.Reliquia;

public class Hobbit extends Criatura implements ILlevaReliquia {

       // Reliquia que porta el hobbit
       public Reliquia reliquia;

    public Hobbit(String nombre, int salud, int stamina, List<Arma> armas, Reliquia reliquia) {
        super(nombre, salud, stamina, armas);
        
    }

 

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