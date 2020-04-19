package app.personaje;

import java.util.List;

import app.ILlevaReliquia;
import app.arma.Arma;
import app.reliquia.Reliquia;

public class Humano extends Personaje implements ILlevaReliquia {
    
    public Reliquia reliquia;// Reliquia que porta el humano

    public Humano(String nombre, int salud, int stamina, List<Arma> armas, Reliquia reliquia) {
        super(nombre, salud, stamina, armas);
        this.reliquia= reliquia;
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