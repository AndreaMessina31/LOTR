package app.personaje;

import java.util.List;

import app.arma.Arma;

public class Criatura extends Personaje {

    public Criatura(String nombre, int salud, int stamina, List<Arma> armas) {
        super(nombre, salud, stamina, armas);
    }

}