package app.reliquia;

import app.IEsMagico;
import app.reliquia.Reliquia;

public class FrascoGaladriel extends Reliquia implements IEsMagico {
    private int energiaMagica; //Valor de la energía que gasta al personaje si ataca o es atacado

    public FrascoGaladriel(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica) {
        super(nombre, factorDeAtaque, factorDeDefensa);
        this.energiaMagica = energiaMagica;
    }

    @Override
    public int getEnergiaMagica() {
        return 0;
    }

    @Override
    public void setEnergiamagica(int energiaMagica) {

    }
}