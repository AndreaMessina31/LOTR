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

  @Override
  public boolean puedoEjecutarAtaqueEpico() {
    // && this.getEnergiaMagica() >= 5
    return this.getStamina() < 40;
  }

  @Override
  public int getEnergiaMagica() {
    return 0;
  }

  @Override
  public void setEnergiaMagica(int energiaMagica) {

  }

  @Override
  public void ataqueEpico(Personaje personajeAtacado, Arma arma) {
    if (puedoEjecutarAtaqueEpico()) {
      personajeAtacado.setSalud(personajeAtacado.getSalud() - (int) (arma.getDanio() + arma.getDanio() * 0.1));
      this.setStamina(0);
      this.setEnergiaMagica(0);
      System.out.println("ataque epicoooo <3 <3 <3 ");
      System.out.println("ataque epicoooo <3 <3 <3 ");

    } else {
      // Se le resta danio al personaje atacado y se le descuenta en "salud"
     personajeAtacado.setSalud(personajeAtacado.getSalud() - arma.getDanio());
      // La stamina del arma decrementa la stamina del personaje.
      this.setStamina(this.getStamina() - arma.getStamina());
    }
  }


  
}
// @Override
// public void ataqueEpico(Personaje personaje, Arma arma) {
// personaje.setSalud(personaje.getSalud() - (int)(arma.getDanio() +
// arma.getDanio() * 0.1));
// this.setStamina(0);
// this.setEnergiaMagica(0);
// System.out.println("ataque epicoooo");
// }

// @Override
// System.out.println("ataque epicoooo");
// }

// @Override
// return super.toString() + "Wizard{" +
// "energiaMagica=" + energiaMagica +
// ", reliquia=" + reliquia +
// '}';
// }
