package app;

public interface IHaceMagia {

    // Devuelve energía mágica del implementador
    public int getEnergiaMagica();

    // Pone la energia magica del implementador
    public void setEnergiaMagica(int EnergiaMagica);

    // true si puede atacar epicamente
    public boolean puedoEjecutarAtaqueEpico();

    // Ejecuta un ataque epico
    public void ataqueEpico(Personaje personaje, Arma arma);
}