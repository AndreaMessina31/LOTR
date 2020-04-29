package app.reliquia;

import app.arma.Arma;
import app.personaje.Personaje;

public class Reliquia {
    private String  nombre; // Nombre de la reliquia.
    private double  factorDeAtaque ; // Numero que representa una forma de incremento de daño. De 0 a 1.
    private double factorDeDefensa; //Numero que representa una forma de decremento de daño recibido. 0 a 1

    public Reliquia ( String nombre, double factorDeAtaque, double factorDeDefensa) {
        this.nombre = nombre ;
        this.factorDeAtaque = factorDeAtaque;
        this.factorDeDefensa = factorDeDefensa;
        //this.factorDeAtaque = factorDeAtaque p1.getArma()  x 0,05(danio);
        //this.factorDeDefensa = factorDeDefensa p2.getArma()  (danio);
    }
public void usarReliquia (Personaje salud  , Arma arma , String nombre){
    
    //Personaje salud  , Arma arma ,
    this.nombre = nombre; 
    factorDeAtaque = (arma.setDanio() + (arma.setDanio() * 0.1));
    factorDeDefensa = (salud.getSalud() + (salud.setSalud() *  0.1));
    System.out.println( "El personaje tiene reliquia");
}
}
//1 = 100 danio
//0,5 = 50 dan