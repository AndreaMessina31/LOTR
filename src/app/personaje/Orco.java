package app.personaje;

import java.util.List;

import app.arma.Arma;

public class Orco extends Criatura {

    public Orco(String nombre, int salud, int stamina, List<Arma> armas) {
        super(nombre, salud, stamina, armas);
    }

}