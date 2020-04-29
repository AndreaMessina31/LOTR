package app.arma;

import app.IEsMagico;
import app.arma.Espada;

//No gasta energia.
public class Anduril extends Espada implements IEsMagico {

    public int getEnergiaMagica() {
        int danioMagia = -10;
        return danioMagia;

    } // Devuelve la energía mágica a reducir cuando el portador ataca
      // Y hace magia o cuando recibe un daño y hace magia

    public void setEnergiamagica(int energiaMagica) {

        energiaMagica = 100; // pone una energia magica.

    }

    public Anduril(String nombre, int danio, int stamina, int energiaMagica) {
        super(nombre, danio, stamina);
        this.setEnergiamagica(energiaMagica);
    }

}
