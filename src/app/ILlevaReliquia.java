package app;

import app.reliquia.Reliquia;

public interface ILlevaReliquia {
    // Devuelve la treliquia del portador
    Reliquia getReliquia();

    // Pone una reliquia a un portador
    void setReliquia(Reliquia reliquia);
}