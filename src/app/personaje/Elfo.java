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

    public Elfo(String nombre, int salud, int stamina, Reliquia reliquia, int energiaMagica) {
        super(nombre, salud, stamina);
        this.reliquia = reliquia;
        this.energiaMagica = energiaMagica;
    }

    @Override
    public int getEnergiaMagica() {
        return energiaMagica;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    @Override
    public boolean puedoEjecutarAtaqueEpico() {

        // return this.getStamina() < 10 && this.energiaMagica >= 20
        if (this.getStamina() < 10 && this.energiaMagica >= 20) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {
        if (puedoEjecutarAtaqueEpico()) {
            this.setStamina(0);
            this.setEnergiaMagica(0);
        }

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