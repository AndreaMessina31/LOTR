package app.reliquia;

import app.IEsMagico;

public class AnilloPoder extends Reliquia implements IEsMagico {

    private int energiaMagica;

    public AnilloPoder(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica) {
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