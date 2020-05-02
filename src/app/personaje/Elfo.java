package app.personaje;

import app.arma.Arma;
import app.IHaceMagia;
import app.ILlevaReliquia;
import app.reliquia.Reliquia;

public class Elfo extends Criatura implements IHaceMagia, ILlevaReliquia {

    public int energiaMagica; // Posee la enregía mágica del Elfo (max 100)
    public Reliquia reliquia;// Reliquia que porta el Elfo

    public Elfo(String nombre, int salud, int stamina, Reliquia reliquia, int energiaMagica) {
        super(nombre, salud, stamina);
        this.reliquia = reliquia;
        this.energiaMagica = energiaMagica;
    }

    @Override
    public boolean puedoEjecutarAtaqueEpico() {
        return this.getStamina() < 20 && this.getEnergiaMagica() >= 20;
    }

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {
        personaje.setSalud(personaje.getSalud() - (int) (arma.getDanio() + arma.getDanio() * 2.5));
        this.setStamina(0);
        this.setEnergiaMagica(0);
        System.out.println("                      ");
        System.out.println("                      *** ATAQUE EPICO *** ");
        System.out.println("                      ");
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    @Override
    public int getEnergiaMagica() {
        return energiaMagica;
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