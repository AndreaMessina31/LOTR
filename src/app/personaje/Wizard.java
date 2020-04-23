package app.personaje;

//IHaceMagia:El Wizard puede hacer magiapor lo cual debe implementar
//esta interface. Sólo puede atacar epicamente si tiene menios de 10
//de stamina y al menos 5 de enrgia magica

import app.arma.Arma;
import app.reliquia.Reliquia;

import app.IHaceMagia;

public class Wizard extends Humano implements IHaceMagia {

    // Posee la energía máx del mago (Max 100)
    public int energiaMagica;

    public Wizard(String nombre, int salud, int stamina, Reliquia reliquia, int energiaMagica) {
        super(nombre, salud, stamina, reliquia);
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
        if (this.getStamina() < 10 && this.energiaMagica >= 5) {
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

}