package app.arma;

import app.IEsMagico;

//No gasta energia.
public class Sting extends Espada implements IEsMagico {

    private int energiaMagica;

    public Sting(String nombre, int danio, int stamina, int energiaMagica) {
        super(nombre, danio, stamina);
        
    }

    @Override
    public int getEnergiaMagica() { 
        
        return energiaMagica;
    }

    @Override
    public void setEnergiamagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;

    }

}