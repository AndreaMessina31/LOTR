package app.personaje;

//IHaceMagia:El Wizard puede hacer magiapor lo cual debe implementar
//esta interface. Sólo puede atacar epicamente si tiene menios de 10
//de stamina y al menos 5 de enrgia magica

import app.arma.Arma;
import app.reliquia.Reliquia;

import app.IHaceMagia;
import app.ILlevaReliquia;


public class Wizard extends Humano implements IHaceMagia {

   
    // Posee la energía máx del mago (Max 100)
    public int energiaMagica;


    public Wizard(String nombre, int salud, int stamina, Reliquia reliquia, int energiaMagica) {
        super(nombre, salud, stamina, reliquia);
        this.energiaMagica = energiaMagica;
    }

int atacc;

    @Override
    }

    @Override
        this.energiaMagica = energiaMagica;
    }

    @Override
    public boolean puedoEjecutarAtaqueEpico() {
<<<<<<< HEAD

        //if (this.getStamina() < 10 && this.energiaMagica >= 5) {
            return this.getStamina() < 30;
        }

        
    
=======
        return  this.getStamina() < 30 && this.getEnergiaMagica() >= 5;
    }
>>>>>>> 6cacde3a539459ea34bb4ee881502afa3bfb66d3

    @Override
            System.out.println("ataque epicoooo");
    }

    @Override
        return super.toString() + "Wizard{" +
                "energiaMagica=" + energiaMagica +
                ", reliquia=" + reliquia +
                '}';
    }
}
