package app.personaje;

import java.util.List;

import app.arma.Arma;

public class Goblin extends Orco {

    public Goblin(String nombre, int salud, int stamina, List<Arma> armas) {
        super(nombre, salud, stamina, armas);
    }

}