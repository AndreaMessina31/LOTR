package app.reliquia;

import app.arma.Arma;
import app.personaje.Personaje;

public class Reliquia {
    public String  nombre; // Nombre de la reliquia.
    public double  factorDeAtaque; // Numero que representa una forma de incremento de daño. De 0 a 1.
    public double factorDeDefensa; //Numero que representa una forma de decremento de daño recibido. 0 a 1

    public Reliquia(String nombre, double factorDeAtaque, double factorDeDefensa) {
        this.nombre = nombre; 
        this.factorDeAtaque = factorDeAtaque;
		this.factorDeDefensa = factorDeDefensa;
    }

    public double getFactorDeAtaque() {
        return factorDeAtaque;
    }

    public double getFactorDeDefensa() {
        return factorDeDefensa;
    }

    public String getNombre() {
        return nombre;
    }
}
