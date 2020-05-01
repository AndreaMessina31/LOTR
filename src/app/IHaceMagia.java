package app;

import app.arma.Arma;
import app.personaje.Personaje;
import app.reliquia.Reliquia;

public interface IHaceMagia {

    // Devuelve energía mágica del implementador
    int getEnergiaMagica();

    // Pone la energia magica del implementador
    void setEnergiaMagica(int energiaMagica);

    // true si puede atacar epicamente
    boolean puedoEjecutarAtaqueEpico();

    // Ejecuta un ataque epico
    void ataqueEpico(Personaje personaje, Arma arma);

}