package app;

//IHaceMagia:El Wizard puede hacer magiapor lo cual debe implementar
//esta interface. Sólo puede atacar epicamente si tiene menios de 10
//de stamina y al menos 5 de enrgia magica

public class Wizard extends Humano implements IHaceMagia {

    // Posee la energía máx del mago (Max 100)
    public int energiaMagica;

    @Override
    public int getEnergiaMagica() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setEnergiaMagica(int EnergiaMagica) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean puedoEjecutarAtaqueEpico() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {
        // TODO Auto-generated method stub

    }

}