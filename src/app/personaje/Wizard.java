package app.personaje;

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
    public boolean puedoEjecutarAtaqueEpico() {
        return  this.getStamina() < 10 && this.getEnergiaMagica() >= 5;
    }

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {
            personaje.setSalud((int) (personaje.getSalud() - (int)(arma.getDanio() + arma.getDanio() * 1.2)));
            this.setStamina(0);
            this.setEnergiaMagica(0);
            System.out.println("ataque epicoooo");
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
    public String toString() {
        return super.toString() + "Wizard{" +
                "energiaMagica=" + energiaMagica +
                ", reliquia=" + reliquia.getNombre() +
                '}';
    }
}


