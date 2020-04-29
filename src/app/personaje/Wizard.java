package app.personaje;

//IHaceMagia:El Wizard puede hacer magiapor lo cual debe implementar
//esta interface. Sólo puede atacar epicamente si tiene menios de 10
//de stamina y al menos 5 de enrgia magica

import app.arma.Arma;
import app.reliquia.Reliquia;

import app.IHaceMagia;
import app.ILlevaReliquia;

public class Wizard extends Humano implements IHaceMagia, ILlevaReliquia {

   
    // Posee la energía máx del mago (Max 100)
    public int energiaMagica;


    public Wizard(String nombre, int salud, int stamina, Reliquia reliquia, int energiaMagica) {
        super(nombre, salud, stamina, reliquia);
        this.energiaMagica = energiaMagica;
    }

int atacc;

    @Override
    public void atacar(Personaje personajeAtacado, Arma arma) {

       // super.atacar(personajeAtacado, arma);
        if (puedoEjecutarAtaqueEpico()){
            
            personajeAtacado.setSalud(personajeAtacado.getSalud() - (int)(arma.getDanio() + arma.getDanio () *0.1));
            this.setStamina(0);
            this.setEnergiaMagica(0);
        System.out.println("Puedes usar ataque epico");


        }  else {

       // Se le resta danio al personaje atacado y se le descuenta en "salud"
        personajeAtacado.setSalud(personajeAtacado.getSalud() - arma.getDanio());
        //La stamina del arma  decrementa la stamina del personaje.
        this.setStamina(this.getStamina() - arma.getStamina());
        }
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
    public boolean puedoEjecutarAtaqueEpico() {
        //if (this.getStamina() < 10 && this.energiaMagica >= 5) {
            return this.getStamina() < 30;
        }

        
    

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {
            this.setStamina(0);
            this.setEnergiaMagica(0);

        }

    }

