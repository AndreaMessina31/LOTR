package app.personaje;

import app.arma.Arma;

import java.util.List;

import app.IHaceMagia;
import app.ILlevaReliquia;
import app.reliquia.Reliquia;

//IHaceMagia:El Wizard puede hacer magia por lo cual debe implementar
//esta interface. Sólo puede atacar epicamente si tiene menos de 10
//de stamina y al menos 20 de enrgia magica
public class Elfo extends Criatura implements IHaceMagia, ILlevaReliquia {

    // Posee la enregía mágica del Elfo (max 100)
    public int energiaMagica;

    public Reliquia reliquia;// Reliquia que porta el Elfo
    
    public Elfo(String nombre, int salud, int stamina, List<Arma> armas, Reliquia reliquia , int energiaMagica) {
        super(nombre, salud, stamina, armas);
        this.reliquia = reliquia;
        this.energiaMagica = energiaMagica;
    }

    @Override
    public int getEnergiaMagica() {
        return 0;
    }

    @Override
    public void setEnergiaMagica(int EnergiaMagica) {

    }

    @Override
    public boolean puedoEjecutarAtaqueEpico() {



        return false;
    }

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {

    }

    @Override
    public Reliquia getReliquia() {
        return null;
    }

    @Override
    public void setReliquia(Reliquia reliquia) {

    }

}