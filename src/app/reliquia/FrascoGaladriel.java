package app.reliquia;

import app.IEsMagico;

public class FrascoGaladriel extends Reliquia implements IEsMagico {
    private int energiaMagica;

    public FrascoGaladriel(String nombre, int factorDeAtaque, int factorDeDefensa, int energiaMagica) {
        super(nombre, factorDeAtaque, factorDeDefensa);
        this.energiaMagica = energiaMagica;
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