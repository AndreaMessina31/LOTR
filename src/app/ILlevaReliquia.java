package app;

import app.arma.Arma;
import app.personaje.Personaje;
import app.reliquia.Reliquia;

//Personajes que llevan reliquia: humano, hobbit y elfo.
public interface ILlevaReliquia {
    // Devuelve la treliquia del portador
    public Reliquia getReliquia();

    // Pone una reliquia a un portador
    public void setReliquia(Reliquia reliquia);

}