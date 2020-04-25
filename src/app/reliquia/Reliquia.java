package app.reliquia;

import app.arma.Arma;
import app.personaje.Personaje;

public class Reliquia {
    public String  nombre; // Nombre de la reliquia.
    public double  factorDeAtaque; // Numero que representa una forma de incremento de daño. De 0 a 1.
    public double factorDeDefensa; //Numero que representa una forma de decremento de daño recibido. 0 a 1

    public Reliquia(Personaje salud  , Arma arma , String nombre, double factorDeAtaque, double factorDeDefensa) {
        this.nombre = nombre; 
        this.factorDeAtaque = factorDeAtaque (arma.setDanio() + (arma.setDanio() * 0.1));
		this.factorDeDefensa = factorDeDefensa (personaje.setSalud() + (personaje.setSalud()+ 0.1));
        System.out.println( "El personaje tiene reliquia");
        

        //this.factorDeAtaque = factorDeAtaque p1.getArma()  x 0,05(danio);
        //this.factorDeDefensa = factorDeDefensa p2.getArma()  (danio);
    }

    }


//1 = 100 danio
//0,5 = 50 danio
