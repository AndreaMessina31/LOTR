package app.arma;

import app.IEsMagico;

public class Anduril extends Espada implements IEsMagico {
    private int energiaMagica;

    public Anduril(String nombre, int danio, int stamina, int energiaMagica) {
        super(nombre, danio, stamina);
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
