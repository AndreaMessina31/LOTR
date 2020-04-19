package app.personaje;

//IHaceMagia:El Wizard puede hacer magiapor lo cual debe implementar
//esta interface. Sólo puede atacar epicamente si tiene menios de 10
//de stamina y al menos 5 de enrgia magica

import app.arma.Arma;
import app.reliquia.Reliquia;

import java.util.List;

import app.IHaceMagia;

public class Wizard extends Humano implements IHaceMagia {

    // Posee la energía máx del mago (Max 100)
    public int energiaMagica;

    public Wizard(String nombre, int salud, int stamina, List<Arma> armas, Reliquia reliquia , int energiaMagica) {
        super(nombre, salud, stamina, armas, reliquia);
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
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {
        // TODO Auto-generated method stub

    }

}