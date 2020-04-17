package app.arma;

import app.IEsMagico;

//No gasta energia.
public class Sting extends Espada implements IEsMagico {

    public Sting(String nombre, int danio, int stamina) {
        super(nombre, danio, stamina);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getEnergiaMagica() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setEnergiamagica(int energiaMagica) {
        // TODO Auto-generated method stub

    }

}